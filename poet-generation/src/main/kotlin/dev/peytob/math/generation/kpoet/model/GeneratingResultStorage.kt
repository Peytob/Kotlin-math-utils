package dev.peytob.math.generation.kpoet.model

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeAliasSpec

data class GeneratingResultStorage(
    val vectorDescriptors: Collection<VectorDescriptor>,
    val vectorTypes: Multimap<VectorDescriptor, VectorSpec> = HashMultimap.create(),
    val factories: Multimap<VectorSpec, FunSpec> = HashMultimap.create(),
    val operations: Multimap<VectorSpec, FunSpec> = HashMultimap.create(),
    val vectorAliases: Multimap<VectorDescriptor, TypeAliasSpec> = HashMultimap.create(),
    val bufferOperations: Multimap<VectorDescriptor, FunSpec> = HashMultimap.create(),
    val accessorOperations: Multimap<VectorDescriptor, FunSpec> = HashMultimap.create(),
)
