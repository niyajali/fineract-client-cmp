val ktlintVersion = "1.0.1"

initscript {
    val spotlessVersion = "6.23.3"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("com.diffplug.spotless:spotless-plugin-gradle:$spotlessVersion")
    }
}

rootProject {
    subprojects {
        apply<com.diffplug.gradle.spotless.SpotlessPlugin>()
        extensions.configure<com.diffplug.gradle.spotless.SpotlessExtension> {
            kotlin {
                target("**/*.kt")
                targetExclude("**/build/**/*.kt")
                ktlint(ktlintVersion).editorConfigOverride(
                    mapOf(
                        "android" to "true",
                    ),
                )
                licenseHeaderFile(rootProject.file("spotless/copyright.kt"))
            }
            format("kts") {
                target("**/*.kts")
                targetExclude("**/build/**/*.kts")
                // Look for the first line that doesn't have a block comment (assumed to be the license)
                licenseHeaderFile(rootProject.file("spotless/copyright.kts"), "(^(?![\\/ ]\\*).*$)")
            }
        }
    }
}