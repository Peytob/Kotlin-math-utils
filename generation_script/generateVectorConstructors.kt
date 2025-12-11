package generation

import com.squareup.kotlinpoet.FunSpec
import org.example.generation.Context
import org.example.generation.Primitive
import org.example.generation.Vector
import org.example.generation.generated
import org.example.generation.getClassName
import org.example.generation.jvmName
import kotlin.collections.plus

fun generateVectorConstructors(context: Context) {
    generateVectorCopyConstructors(context, context.vec2)
    generateVectorCopyConstructors(context, context.vec3)

    generateVectorFlatConstructors(context, context.vec2)
    generateVectorFlatConstructors(context, context.vec3)

    generateVectorEmptyConstructors(context, context.vec2)
    generateVectorEmptyConstructors(context, context.vec3)
}

fun generateVectorCopyConstructors(context: Context, vector: Vector) {
    vector.constructors += vector.realisations.flatMap { realisation ->
        val realisationPrimitive = realisation.getPrimitive()
        Primitive.entries.map { constructorPrimitive ->
            val funBuilder = FunSpec
                .builder(getConstructorName(vector.components, realisationPrimitive.postfix))
                .generated()
                .jvmName(getJvmName(vector.components, realisationPrimitive.postfix, ""))
                .addParameter("vec", vector.getAliasClassName(constructorPrimitive))
                .returns(vector.getAliasClassName(realisationPrimitive))

            funBuilder.addStatement("val arr = %T(%L)", realisationPrimitive.array, vector.components.size)
            vector.components.forEachIndexed { index, component ->
                funBuilder.addStatement("arr[%L] = vec.%N.%N()", index, component, realisationPrimitive.cast)
            }
            funBuilder.addStatement("return %T(arr = arr, arrIndex = 0)", realisation.getClassName())

            funBuilder.build()
        }
    }
}

fun generateVectorFlatConstructors(context: Context, vector: Vector) {
    vector.constructors += vector.realisations.flatMap { realisation ->
        val realisationPrimitive = realisation.getPrimitive()
        Primitive.entries.map { constructorPrimitive ->
            val funBuilder = FunSpec
                .builder(getConstructorName(vector.components, realisationPrimitive.postfix))
                .generated()
                .jvmName(getJvmName(vector.components, realisationPrimitive.postfix, constructorPrimitive.postfix))

            funBuilder.returns(vector.getAliasClassName(realisationPrimitive))

            vector.components.forEach { component ->
                funBuilder.addParameter(component, constructorPrimitive.primitive)
            }

            funBuilder.addStatement("val arr = %T(%L)", realisationPrimitive.array, vector.components.size)
            vector.components.forEachIndexed { index, component ->
                funBuilder.addStatement("arr[%L] = %N.%N()", index, component, realisationPrimitive.cast)
            }
            funBuilder.addStatement("return %T(arr = arr, arrIndex = 0)", realisation.getClassName())

            funBuilder.build()
        }
    }
}

fun generateVectorEmptyConstructors(context: Context, vector: Vector) {
    vector.constructors += vector.realisations.map { realisation ->
        val realisationPrimitive = realisation.getPrimitive()
        val constructorName = getConstructorName(vector.components, realisationPrimitive.postfix)

        val funBuilder = FunSpec
            .builder(constructorName)
            .generated()
            .jvmName(getJvmName(vector.components, realisationPrimitive.postfix, ""))

        funBuilder.returns(vector.getAliasClassName(realisationPrimitive))

        val componentsArgs = vector.components.joinToString(", ") { "0.${realisationPrimitive.cast}()" }
        funBuilder.addStatement("return %L($componentsArgs)", constructorName)

        funBuilder.build()
    }
}

private fun getConstructorName(components: Collection<String>, realisationPostfix: String): String {
    return "vec${components.size}$realisationPostfix"
}

private fun getJvmName(components: Collection<String>, realisationPostfix: String, constructorPostfix: String): String {
    return getConstructorName(components, realisationPostfix) + constructorPostfix
}
