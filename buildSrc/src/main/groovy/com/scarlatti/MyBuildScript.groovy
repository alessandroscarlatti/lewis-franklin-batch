package com.scarlatti

import org.gradle.api.Project
import org.gradle.api.Plugin

class MyBuildScript implements Plugin<Project> {
    void apply(Project project) {

        println "applying custom build"

        project.with {
            sourceSets {

                shared {
                    groovy {
                        srcDirs = ['src/test/shared/groovy']
                    }

                    resources {
                        srcDirs = ['src/test/shared/resources']
                    }

                    compileClasspath += sourceSets.test.runtimeClasspath
                    runtimeClasspath += sourceSets.test.runtimeClasspath
                }

                systemTest {
                    groovy {
                        srcDirs = ['src/test/system/groovy',]
                    }
                    resources {
                        srcDirs = [
                                'src/test/system/resources',
                        ]
                    }

                    compileClasspath += sourceSets.shared.runtimeClasspath
                    runtimeClasspath += sourceSets.shared.runtimeClasspath
                }

                unitTest {
                    groovy {
                        srcDirs = ['src/test/unit/groovy']
                    }
                    resources {
                        srcDirs = [
                                'src/test/unit/resources',
                        ]
                    }

                    compileClasspath += sourceSets.shared.runtimeClasspath
                    runtimeClasspath += sourceSets.shared.runtimeClasspath
                }

                // we need to build the shared source set
                functionTest {
                    groovy {
                        srcDirs = ['src/test/function/groovy']
                    }
                    resources {
                        srcDirs = [
                                'src/test/function/resources',
                        ]
                    }

                    compileClasspath += sourceSets.shared.runtimeClasspath
                    runtimeClasspath += sourceSets.shared.runtimeClasspath
                }

                util {
                    groovy {
                        srcDirs = ['src/test/util/groovy']
                    }
                    resources {
                        srcDirs = [
                                'src/test/util/resources',
                        ]
                    }

                    compileClasspath += sourceSets.shared.runtimeClasspath
                    runtimeClasspath += sourceSets.shared.runtimeClasspath
                }

            }
        }
    }
}