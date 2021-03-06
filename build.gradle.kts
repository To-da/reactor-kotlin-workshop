import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val kotlinVersion = "1.1.51"
    id("org.jetbrains.kotlin.jvm") version kotlinVersion
}

repositories {
    mavenCentral()
    maven {
        setUrl("https://repo.spring.io/milestone")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib-jre8")
    compile("io.projectreactor:reactor-core:3.1.0.RELEASE")
    compile("io.reactivex.rxjava2:rxjava:2.0.5")
    testCompile("junit:junit:4.12")
    testCompile("io.projectreactor:reactor-test:3.1.0.RELEASE")
}
