package dev.peytob.math.generation.kpoet.model

import dev.peytob.math.generation.kpoet.generation.vector.operation.generateConstructorName

class GenerationContext(
    private val primitives: Collection<Primitive>,
    private val vectorAccessors: Collection<VectorAccessor>
) {

    private val vectors: MutableCollection<Vector> = mutableListOf()

    private val functions: MutableCollection<Function> = mutableListOf()

    private val typedVectorBases: MutableCollection<TypedVectorBase> = mutableListOf()

    private val typedVectorAccessors: MutableCollection<TypedVectorAccessor> = mutableListOf()

    fun registerVector(vector: Vector) {
        val isExists = vectors.any { it.base == vector.base && it.size == vector.size && it.isMutable == vector.isMutable && it.primitive == vector.primitive }

        if (isExists) {
            throw RuntimeException("Vector ${vector.alias.name} already exists")
        }

        vectors.add(vector)
    }

    fun getPrimitives(): Collection<Primitive> = primitives

    fun getVectorAccessors(): Collection<VectorAccessor> = vectorAccessors

    fun getVectors(): Collection<Vector> = vectors
    
    fun registerFunction(function: Function) {
        val isExists = functions.any {
            it.name == function.name &&
            it.packageName == function.packageName &&
            it.funSpec.parameters == function.funSpec.parameters &&
            it.funSpec.receiverType == function.funSpec.receiverType
        }

        if (isExists) {
            throw IllegalStateException("Function ${function.name}(${function.operandsAliases.joinToString(", ")}) already exists")
        }

        functions.add(function)
    }

    fun getFunctions(): Collection<Function> = functions
    
    fun forEachVectorPair(action: (Vector, Vector) -> Collection<Function>): Collection<Function> {
        return vectors.flatMap { leftVector -> vectors.flatMap { rightVector -> action(leftVector, rightVector) } }
    }

    private fun getFunction(name: String): Function? {
        return getFunctions().firstOrNull { it.name == name }
    }

    fun getConstructor(leftVector: TypedVectorBase): Function? {
        val constructor = generateConstructorName(leftVector.alias, leftVector.isMutable)
        return getFunction(constructor)
    }

    fun registerTypedVectorBase(typedVectorBase: TypedVectorBase) {
        if (typedVectorBases.contains(typedVectorBase)) {
            throw IllegalStateException("Typed vector base ${typedVectorBase.alias} already registered in context")
        }

        typedVectorBases.add(typedVectorBase)
    }

    fun registerTypedVectorAccessor(typedVectorAccessor: TypedVectorAccessor) {
        if (typedVectorAccessors.contains(typedVectorAccessor)) {
            throw IllegalStateException("Typed vector base ${typedVectorAccessor.alias} already registered in context")
        }

        typedVectorAccessors.add(typedVectorAccessor)
    }

    fun getTypedVectorBases(): Collection<TypedVectorBase> {
        return typedVectorBases
    }

    fun getTypedVectorAccessors(): Collection<TypedVectorAccessor> {
        return typedVectorAccessors
    }

    fun getVectorBases(): Collection<VectorBase> {
        return typedVectorBases.map {
            it.base
        }.toSet()
    }
}