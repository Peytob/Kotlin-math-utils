package dev.peytob.math.generation.kpoet.model

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.squareup.kotlinpoet.FunSpec

data class GeneratingResultStorage(
    val vectorTypes: Multimap<VectorDescriptor, VectorSpec> = HashMultimap.create(),
    val factories: Multimap<VectorSpec, FunSpec> = HashMultimap.create(),
    val operations: Multimap<VectorSpec, FunSpec> = HashMultimap.create(),
    val bufferOperations: Multimap<VectorSpec, FunSpec> = HashMultimap.create(),
)