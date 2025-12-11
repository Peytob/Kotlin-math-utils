package generation

import com.squareup.kotlinpoet.Taggable
import com.squareup.kotlinpoet.TypeAliasSpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.tag
import org.example.generation.Primitive
import org.example.generation.Vector
import kotlin.reflect.KClass

private data class PackageTag(
    val pkg: String
)

private data class AliasTypeTag(
    val cls: KClass<*>
)

private data class PrimitiveTag(
    val primitive: Primitive
)

private data class VectorDescriptionTag(
    val vector: Vector
)

fun TypeSpec.Builder.addPackage(pkg: String): TypeSpec.Builder {
    return tag(PackageTag(pkg))
}

fun TypeAliasSpec.Builder.addPackage(pkg: String): TypeAliasSpec.Builder {
    return tag(PackageTag(pkg))
}

fun Taggable.getPackage(): String {
    return (tags[PackageTag::class] as? PackageTag)?.pkg ?: throw RuntimeException("No package tag found")
}

fun TypeSpec.Builder.addAlias(alias: KClass<*>): TypeSpec.Builder {
    return tag(AliasTypeTag(alias))
}

fun Taggable.getAlias(): KClass<*>? {
    return (tags[AliasTypeTag::class] as? AliasTypeTag)?.cls
}

fun TypeSpec.Builder.addVectorDescription(vector: Vector): TypeSpec.Builder {
    return tag(VectorDescriptionTag(vector))
}

fun Taggable.getVectorDescription(): Vector {
    return (tags[VectorDescriptionTag::class] as? VectorDescriptionTag)?.vector
        ?: throw java.lang.RuntimeException("No vector tag found")
}

fun TypeSpec.getPrimitiveIfExists(): Primitive? {
    return (tags[PrimitiveTag::class] as? PrimitiveTag)?.primitive
}

fun TypeSpec.Builder.addPrimitive(primitive: Primitive): TypeSpec.Builder {
    return tag(PrimitiveTag(primitive))
}

fun TypeSpec.getPrimitive(): Primitive {
    return getPrimitiveIfExists() ?: throw RuntimeException("No primitive tag found")
}
