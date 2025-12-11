package generation

import com.squareup.kotlinpoet.*
import org.example.generation.*
import java.nio.ByteBuffer

typealias ReturnsF = (leftVector: TypeSpec, targetPrimitive: Primitive?) -> ClassName?
typealias ParametersF = (leftVector: TypeSpec, targetPrimitive: Primitive?) -> Map<String, ClassName>

private class Arguments(
    val returns: ReturnsF,
    val parameters: ParametersF
)

private fun returnLeftVector(): ReturnsF {
    return { leftVector, _ -> leftVector.getClassName() }
}

private fun returnNothing(): ReturnsF {
    return { _, _ -> null }
}

private fun returnScalar(primitive: Primitive): ReturnsF {
    return returnCustom(primitive.primitive.asClassName())
}

private fun returnCustom(className: ClassName): ReturnsF {
    return { _, _ -> className }
}

private fun parameterSameVector(): ParametersF {
    return { leftVector, targetPrimitive ->
        if (targetPrimitive == null) {
            throw IllegalArgumentException()
        }
        val vector = leftVector.getVectorDescription()
        mapOf(
            "right" to vector.getAliasClassName(targetPrimitive)
        )
    }
}

private fun parameterFlatSameVector(): ParametersF {
    return { leftVector, targetPrimitive ->
        if (targetPrimitive == null) {
            throw IllegalArgumentException()
        }
        val vector = leftVector.getVectorDescription()
        vector.components.associateWith { targetPrimitive.primitive.asClassName() }
    }
}

private fun parameterLeftVector(): ParametersF {
    return { leftVector, _ ->
        mapOf(
            "right" to leftVector.getClassName()
        )
    }
}

private fun parameterScalar(): ParametersF {
    return { _, targetPrimitive ->
        if (targetPrimitive == null) {
            throw IllegalArgumentException()
        }

        mapOf("right" to targetPrimitive.primitive.asClassName())
    }
}

private fun noParameters(): ParametersF {
    return { _, _ -> mapOf() }
}

private fun parametersCustom(vararg parameters: Pair<String, ClassName>): ParametersF {
    return { _, _ -> mapOf(*parameters) }
}

private class OperatorLiterals(
    val operator: String,
    val functionName: String,
    val canBeKotlinOperator: Boolean
)

private data class MethodDescriptor(
    val literals: OperatorLiterals,
    val arguments: Arguments,
    val comment: String
) {
    constructor(name: String, arguments: Arguments, comment: String)
            : this(OperatorLiterals("", name, false), arguments, comment)
}

private class RealisationArguments {
    lateinit var leftVector: Vector
    lateinit var leftPrimitive: Primitive
    lateinit var rightVector: Vector
    lateinit var rightPrimitive: Primitive
}

private typealias RealisationF = (RealisationArguments, MethodDescriptor) -> CodeBlock

fun generateVectorOperations(context: Context) {
    generateVectorOperations(context.vec2)
    generateVectorOperations(context.vec3)

    generateVectorOuterMethods(context.vec2)
    generateVectorOuterMethods(context.vec3)
}

private fun generateVectorOperations(vector: Vector) {
    val plus = OperatorLiterals(
        operator = "+",
        "plus",
        canBeKotlinOperator = true
    )

    generateVectorBinaryOperation(vector, MethodDescriptor(
        literals = plus,
        arguments = Arguments(
            returns = returnLeftVector(),
            parameters = parameterSameVector()
        ),
        comment = "Component-wise plus operation with vectors. Result will be written into left vector"),
        realisation = ::arithmeticOperationTemplate
    )

    generateVectorBinaryOperation(vector, MethodDescriptor(
        literals = plus,
        arguments = Arguments(
            returns = returnLeftVector(),
            parameters = parameterFlatSameVector()
        ),
        comment = "Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector"),
        realisation = ::flatArithmeticOperationTemplate
    )

    generateVectorBinaryOperation(vector, MethodDescriptor(
        literals = plus,
        arguments = Arguments(
            returns = returnLeftVector(),
            parameters = parameterScalar()
        ),
        comment = "Component-wise plus operation between vector and scalar. Result will be written into left vector"),
        realisation = ::scalarArithmeticOperationTemplate
    )

    val minus = OperatorLiterals(
        operator = "-",
        "minus",
        canBeKotlinOperator = true
    )

    generateVectorBinaryOperation(vector, MethodDescriptor(
        literals = minus,
        arguments = Arguments(
            returns = returnLeftVector(),
            parameters = parameterSameVector()
        ),
        comment = "Component-wise minus operation with vectors. Result will be written into left vector"),
        realisation = ::arithmeticOperationTemplate
    )

    generateVectorBinaryOperation(vector, MethodDescriptor(
        literals = minus,
        arguments = Arguments(
            returns = returnLeftVector(),
            parameters = parameterFlatSameVector()
        ),
        comment = "Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector"),
        realisation = ::flatArithmeticOperationTemplate
    )

    generateVectorBinaryOperation(vector, MethodDescriptor(
        literals = minus,
        arguments = Arguments(
            returns = returnLeftVector(),
            parameters = parameterScalar()
        ),
        comment = "Component-wise minus operation between vector and scalar. Result will be written into left vector"),
        realisation = ::scalarArithmeticOperationTemplate
    )

    val times = OperatorLiterals(
        operator = "*",
        "times",
        canBeKotlinOperator = true
    )

    generateVectorBinaryOperation(vector, MethodDescriptor(
        literals = times,
        arguments = Arguments(
            returns = returnLeftVector(),
            parameters = parameterSameVector()
        ),
        comment = "Component-wise multiplication operation with vectors. Result will be written into left vector"),
        realisation = ::arithmeticOperationTemplate
    )

    generateVectorBinaryOperation(vector, MethodDescriptor(
        literals = times,
        arguments = Arguments(
            returns = returnLeftVector(),
            parameters = parameterFlatSameVector()
        ),
        comment = "Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector"),
        realisation = ::flatArithmeticOperationTemplate
    )

    generateVectorBinaryOperation(vector, MethodDescriptor(
        literals = times,
        arguments = Arguments(
            returns = returnLeftVector(),
            parameters = parameterScalar()
        ),
        comment = "Component-wise multiplication operation between vector and scalar. Result will be written into left vector"),
        realisation = ::scalarArithmeticOperationTemplate
    )

    val dot = OperatorLiterals(
        operator = "",
        "dot",
        canBeKotlinOperator = false
    )

    generateVectorBinaryOperation(vector, MethodDescriptor(
        literals = dot,
        arguments = Arguments(
            returns = returnScalar(Primitive.FLOAT),
            parameters = parameterSameVector()
        ),
        comment = "Component-wise dot operation with vectors"),
    ) { arguments, _ ->
        val code = CodeBlock.builder()

        val multiplication = arguments.leftVector.components.joinToString(" + ") { component ->
            "$component * right.$component"
        }

        code.addStatement("return ($multiplication).toFloat()")

        code.build()
    }

    generateVectorBinaryOperation(vector, MethodDescriptor(
        literals = dot,
        arguments = Arguments(
            returns = returnScalar(Primitive.FLOAT),
            parameters = parameterScalar()
        ),
        comment = "Component-wise dot operation with scalar. Every component will be multiplied by given scalar"),
    ) { arguments, _ ->
        val code = CodeBlock.builder()

        val multiplication = arguments.leftVector.components.joinToString(" + ") { component ->
            "$component * right"
        }

        code.addStatement("return ($multiplication).toFloat()")

        code.build()
    }

    generateVectorBinaryOperation(vector, MethodDescriptor(
        literals = dot,
        arguments = Arguments(
            returns = returnScalar(Primitive.FLOAT),
            parameters = parameterFlatSameVector()
        ),
        comment = "Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector"),
    ) { arguments, _ ->
        val code = CodeBlock.builder()

        val multiplication = arguments.leftVector.components.joinToString(" + ") { component ->
            "$component * $component"
        }

        code.addStatement("return ($multiplication).toFloat()")

        code.build()
    }

    generateVectorBinaryOperation(vector, MethodDescriptor(
        name = "toBuffer",
        arguments = Arguments(
            returns = returnNothing(),
            parameters = { _, primitive ->
                val pair = "buffer" to Class.forName("java.nio.${primitive!!.primitive.simpleName}Buffer").asClassName()
                mapOf(pair)
            }
        ),
        comment = "Puts this vector into given buffer. Vector values will be cast to vector type"),
        realisation = ::bufferOperationTemplate
    )

    generateVectorBinaryOperationSingle(vector, MethodDescriptor(
        name = "toBuffer",
        arguments = Arguments(
            returns = returnNothing(),
            parameters = parametersCustom("buffer" to ByteBuffer::class.asClassName())
        ),
        comment = "Puts this vector into given buffer")
    ) { arguments, _ ->
        val code = CodeBlock.builder()
        val primitiveName = arguments.leftPrimitive.primitive.simpleName

        vector.components.forEach { component ->
            code.addStatement("buffer.put$primitiveName(%1N)", component)
        }

        code.build()
    }
}

private fun generateVectorOuterMethods(vector: Vector) {
    val outerMethods = mutableListOf<FunSpec>()
    val sqrtMember = MemberName("kotlin.math", "sqrt")

    outerMethods += generateVectorOuterOperationSingle(vector, MethodDescriptor(
        name = "length",
        arguments = Arguments(
            returns = returnScalar(Primitive.FLOAT),
            parameters = parameterLeftVector()
        ),
        comment = "Returns length of the vector")
    ) { arguments, _ ->
        val code = CodeBlock.builder()

        val multiplication = arguments.leftVector.components.joinToString(" + ") { component ->
            "right.$component * right.$component"
        }

        code.addStatement("return %M(($multiplication).toFloat())", sqrtMember)

        code.build()
    }

    outerMethods += generateVectorOuterOperation(vector, MethodDescriptor(
        name = "distance",
        arguments = Arguments(
            returns = returnScalar(Primitive.FLOAT),
            parameters = { leftVector, primitive ->
                mapOf(
                    "left" to leftVector.getClassName(),
                    "right" to vector.getAliasClassName(primitive!!))
            },
        ),
        comment = "Returns distance between two vector")
    ) { arguments, _ ->
        val code = CodeBlock.builder()

        val multiplication = arguments.leftVector.components.joinToString(" + ") { component ->
            "right.$component * right.$component"
        }

        code.addStatement("return %M(($multiplication).toFloat())", sqrtMember)

        code.build()
    }

    vector.outerMethods = outerMethods
}

private fun generateVectorBinaryOperationSingle(vector: Vector, descriptor: MethodDescriptor, realisation: RealisationF) {
    vector.interfaces = vector.interfaces.map { leftVector ->
        val function = generateBinaryOperation(vector, leftVector, null, descriptor)
        leftVector.toBuilder()
            .addFunction(function)
            .build()
    }

    vector.realisations = vector.realisations.map { leftVector ->
        val function = generateBinaryOperation(vector, leftVector, null, descriptor, isOverride = true, realisation)
        leftVector.toBuilder()
            .addFunction(function)
            .build()
    }
}

private fun generateVectorBinaryOperation(vector: Vector, descriptor: MethodDescriptor, realisation: RealisationF) {
    val interfaceMethods = vector.interfaces.associateWith { leftVector ->
        Primitive.entries.map { targetPrimitive ->
            generateBinaryOperation(vector, leftVector, targetPrimitive, descriptor)
        }
    }

    vector.interfaces = vector.interfaces.map { leftVector ->
        val methods = interfaceMethods[leftVector] ?: throw IllegalStateException("Interface method not found")
        leftVector.toBuilder().addFunctions(methods).build()
    }

    val realisationMethods = vector.realisations.associateWith { leftVector ->
        Primitive.entries.map { targetPrimitive ->
            generateBinaryOperation(vector, leftVector, targetPrimitive, descriptor, isOverride = true, realisation)
        }
    }

    vector.realisations = vector.realisations.map { leftVector ->
        val methods = realisationMethods[leftVector] ?: throw IllegalStateException("Realisation method not found")
        leftVector.toBuilder().addFunctions(methods).build()
    }
}

private fun generateVectorOuterOperationSingle(vector: Vector, descriptor: MethodDescriptor, realisation: RealisationF): Collection<FunSpec> {
    return vector.interfaces.map { leftVector ->
        generateBinaryOperation(vector, leftVector, null, descriptor, isOverride = false, realisation)
    }
}

private fun generateVectorOuterOperation(vector: Vector, descriptor: MethodDescriptor, realisation: RealisationF): Collection<FunSpec> {
    return vector.interfaces.flatMap { leftVector ->
        Primitive.entries.map { targetPrimitive ->
            generateBinaryOperation(vector, leftVector, targetPrimitive, descriptor, isOverride = false, realisation)
        }
    }
}

private fun generateBinaryOperation(vector: Vector, leftVector: TypeSpec, primitive: Primitive?, descriptor: MethodDescriptor, isOverride: Boolean = false, realisation: RealisationF? = null): FunSpec {
    val builder = FunSpec.builder(descriptor.literals.functionName)
        .addKdoc(descriptor.comment)
    val realisationArguments = RealisationArguments()
    realisationArguments.leftVector = vector
    leftVector.getPrimitiveIfExists()?.run { realisationArguments.leftPrimitive = this }
    if (primitive != null) {
        realisationArguments.rightPrimitive = primitive
    }

    descriptor.arguments.returns(leftVector, primitive)?.apply(builder::returns)
    val parameters = descriptor.arguments.parameters(leftVector, primitive).map { (name, className) ->
        ParameterSpec.builder(name, className).build()
    }

    builder.addParameters(parameters)

    if (realisation != null) {
        builder.addCode(realisation(realisationArguments, descriptor))
        if (isOverride) {
            builder.addModifiers(KModifier.OVERRIDE)
        }
    } else {
        builder.addModifiers(KModifier.ABSTRACT)
    }

    if (descriptor.literals.canBeKotlinOperator && parameters.size == 1) {
        builder.addModifiers(KModifier.OPERATOR)
    }

    return builder.build()
}

private fun arithmeticOperationTemplate(arguments: RealisationArguments, descriptor: MethodDescriptor): CodeBlock {
    val codeBlock = CodeBlock.builder()

    arguments.leftVector.components.forEach { component ->
        val primitive = arguments.leftPrimitive
        codeBlock.addStatement("this.%1N = (this.%1N %3L right.%1N).%2N()", component, primitive.cast, descriptor.literals.operator)
    }

    codeBlock.addStatement("return this")
    return codeBlock.build()
}

private fun flatArithmeticOperationTemplate(arguments: RealisationArguments, descriptor: MethodDescriptor): CodeBlock {
    val codeBlock = CodeBlock.builder()

    arguments.leftVector.components.forEach { component ->
        val primitive = arguments.leftPrimitive
        codeBlock.addStatement("this.%1N = (this.%1N %3L %1N).%2N()", component, primitive.cast, descriptor.literals.operator)
    }

    codeBlock.addStatement("return this")
    return codeBlock.build()
}

private fun scalarArithmeticOperationTemplate(arguments: RealisationArguments, descriptor: MethodDescriptor): CodeBlock {
    val codeBlock = CodeBlock.builder()

    arguments.leftVector.components.forEach { component ->
        val primitive = arguments.leftPrimitive
        codeBlock.addStatement("this.%1N = (this.%1N %3L right).%2N()", component, primitive.cast, descriptor.literals.operator)
    }

    codeBlock.addStatement("return this")
    return codeBlock.build()
}

private fun bufferOperationTemplate(arguments: RealisationArguments, descriptor: MethodDescriptor): CodeBlock {
    val codeBlock = CodeBlock.builder()

    arguments.leftVector.components.forEach { component ->
        codeBlock.addStatement("buffer.put(%1N.%2N())", component, arguments.rightPrimitive.cast)
    }

    return codeBlock.build()
}

