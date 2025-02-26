package dev.peytob.math.generation.kpoet.generation.vector

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.model.VectorAccessor

fun generateVectorAccessor(vectorAccessor: VectorAccessor): TypeSpec {
    val typeVariable = TypeVariableName("T", listOf(Number::class))

    val typeSpecBuilder = TypeSpec.interfaceBuilder("Vec${vectorAccessor.size}Accessor")
        .generated()
        .addTypeVariable(typeVariable)
        .addProperty("elementSizeBytes", Int::class)
        .addProperty("vectorSizeBytes", Int::class)
        .addProperty(
            PropertySpec.builder("elementsCount", Int::class)
            .getter(
                FunSpec.getterBuilder()
                .addCode("return %L", vectorAccessor.size.toString())
                .build())
            .build())

    vectorAccessor.components.forEach { component ->
        typeSpecBuilder.addProperty(component, typeVariable)
    }

    vectorAccessor.components.forEachIndexed { index, component ->
        typeSpecBuilder.addFunction(FunSpec.builder("component${index}")
            .addModifiers(KModifier.OPERATOR)
            .returns(typeVariable)
            .addCode("return %L", component)
            .build())
    }

    val getCodeBlockBuilder = CodeBlock.builder()

    getCodeBlockBuilder.beginControlFlow("when (index)")
    vectorAccessor.components.forEachIndexed { index, component ->
        getCodeBlockBuilder.addStatement("$index -> $component")
    }
    getCodeBlockBuilder.addStatement("else -> throw IndexOutOfBoundsException()")

    getCodeBlockBuilder.endControlFlow()

    typeSpecBuilder.addFunction(FunSpec.builder("get")
        .addModifiers(KModifier.OPERATOR)
        .addCode(getCodeBlockBuilder.build())
        .addParameter("index", Int::class)
        .build())

    return typeSpecBuilder.build()
}
