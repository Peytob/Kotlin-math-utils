package dev.peytob.math.generation.kpoet.generation.vector.instance

import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.model.VectorAccessor

fun generateVectorImmutableBase(vectorAccessor: VectorAccessor): TypeSpec {
    val typeVariable = TypeVariableName("T", listOf(Number::class))

    return TypeSpec.interfaceBuilder("Vec${vectorAccessor.size}")
        .generated()
        .addTypeVariable(typeVariable)
        .addSuperinterface(vectorAccessor.className.parameterizedBy(typeVariable))
        .build()
}

fun generateVectorMutableBase(vectorAccessor: VectorAccessor): TypeSpec {
    val typeVariable = TypeVariableName("T", listOf(Number::class))

    val typeSpecBuilder = TypeSpec.interfaceBuilder("MutVec${vectorAccessor.size}")
        .generated()
        .addTypeVariable(typeVariable)
        .addSuperinterface(vectorAccessor.className.parameterizedBy(typeVariable))

    vectorAccessor.components.forEach { component ->
        val property = PropertySpec.builder(component, typeVariable)
            .addModifiers(KModifier.OVERRIDE)
            .mutable()
            .build()

        typeSpecBuilder.addProperty(property)
    }

    return typeSpecBuilder.build()
}
