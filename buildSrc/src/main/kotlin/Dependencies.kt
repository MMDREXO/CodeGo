@file:Suppress("unused")

import Version.COMPOSE
import org.gradle.api.artifacts.Dependency
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.project

val DependencyHandlerScope.androidKtCore: String
    get() = "androidx.core:core-ktx:1.5.0"

val DependencyHandlerScope.appCompat: String
    get() = "androidx.appcompat:appcompat:1.3.0"

val DependencyHandlerScope.material: String
    get() = "com.google.android.material:material:1.3.0"

val DependencyHandlerScope.composeUI: String
    get() = "androidx.compose.ui:ui:$COMPOSE"

val DependencyHandlerScope.composeMaterial: String
    get() = "androidx.compose.material:material:$COMPOSE"

val DependencyHandlerScope.composeUITooling: String
    get() = "androidx.compose.ui:ui-tooling:$COMPOSE"

val DependencyHandlerScope.androidxLifecycle: String
    get() = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"

val DependencyHandlerScope.activityCompose: String
    get() = "androidx.activity:activity-compose:1.3.0-alpha08"

val DependencyHandlerScope.composeJUNIT: String
    get() = "androidx.compose.ui:ui-test-junit4:$COMPOSE"

val DependencyHandlerScope.jUnit: String
    get() = "junit:junit:4.13.2"

val DependencyHandlerScope.kScriptRuntime: Any
    get() = kotlin("script-runtime")

val DependencyHandlerScope.reflection: Any
    get() = kotlin("reflect")

val DependencyHandlerScope.scriptUtil: Any
    get() = kotlin("script-util")

val DependencyHandlerScope.scriptingCompiler: Any
    get() = kotlin("scripting-compiler-embeddable")

val DependencyHandlerScope.codeeCore: Dependency
    get() = project(":core")

val DependencyHandlerScope.scriptingDependencies: Any
    get() = kotlin("kotlin-scripting-dependencies")

val DependencyHandlerScope.androidBuildTools: String
    get() = "com.android.tools.build:gradle:7.0.0-beta03"

val DependencyHandlerScope.kotlinGradlePlugin: String
    get() = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN}"
