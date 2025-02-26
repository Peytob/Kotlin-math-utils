package dev.peytob.math.generation.kpoet.model

class GenerationContext(
    private val primitives: Collection<Primitive>,
    private val vectorAccessors: Collection<VectorAccessor>
) {

    private val vectors: MutableCollection<Vector> = mutableListOf()

    private val functions: MutableCollection<Function> = mutableListOf()

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
}