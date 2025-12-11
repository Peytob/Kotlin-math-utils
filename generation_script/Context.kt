package org.example.generation

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeAliasSpec
import com.squareup.kotlinpoet.TypeSpec
import generation.getAlias
import java.nio.file.Path
import kotlin.reflect.KClass

data class Context(
    val generatingSettings: GeneratingSettings
) {
    val baseInterfaces: BaseInterfaces = BaseInterfaces()

    val vec2: Vector = Vector(listOf("x", "y"))
    val vec3: Vector = Vector(listOf("x", "y", "z"))

    fun pkg(pkg: String): String {
        return generatingSettings.targetPackage + "." + pkg
    }
}

data class GeneratingSettings(
    /**
     * Target base package for all generated data
     */
    val targetPackage: String,

    /**
     * Target path to saving generated data
     */
    val targetPath: Path
)

class BaseInterfaces {
    lateinit var memorizedObject: TypeSpec
    lateinit var vec: TypeSpec
}

class Vector(
    val components: Collection<String>
) {
    lateinit var baseInterface: TypeSpec
    lateinit var interfaces: Collection<TypeSpec>
    lateinit var realisations: Collection<TypeSpec>
    var outerMethods: Collection<FunSpec> = listOf()
    var constructors: Collection<FunSpec> = listOf()

    fun getAliasClassName(cls: KClass<*>): ClassName {
        return interfaces.firstOrNull {
            val aliasType = it.getAlias()
                ?: throw RuntimeException("Alias tag for ${it.name} not found")

            aliasType == cls
        }?.getClassName() ?: throw RuntimeException("Alias not found")
    }

    fun getAliasClassName(primitive: Primitive): ClassName {
        return getAliasClassName(primitive.primitive)
    }
}
