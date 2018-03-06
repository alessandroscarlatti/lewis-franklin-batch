package com.scarlatti

import org.gradle.api.Project
import org.gradle.api.tasks.SourceSet

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Monday, 3/5/2018
 */
class TestSourceSetFactory {

    static newSourceSet(Project project) {
        return new TestSourceSetBuilder(project)
    }

    static class TestSourceSetBuilder {
        private Project project
        private String sourceSetName
        private List<String> newSrcDirs
        private List<String> newResourceDirs
        private List<SourceSet> newDependencies

        private TestSourceSetBuilder(Project project) {
            this.project = project
        }

        TestSourceSetBuilder withName(String name) {
            sourceSetName = name
            return this
        }

        TestSourceSetBuilder withSrcDirs(List<String> dirs) {
            newSrcDirs = dirs
            return this
        }

        TestSourceSetBuilder withResourceDirs(List<String> dirs) {
            newResourceDirs = dirs
            return this
        }

        TestSourceSetBuilder withDependencies(List<SourceSet> dependencies) {
            this.newDependencies = dependencies
            return this
        }

        void build() {
            project.with {
                shared {
                    groovy {
                        srcDirs = newSrcDirs
                    }

                    resources {
                        srcDirs = newResourceDirs
                    }

                    for (SourceSet sourceSet : newDependencies) {
                        compileClasspath += sourceSet.runtimeClasspath
                        runtimeClasspath += sourceSet.runtimeClasspath
                    }
                }
            }
        }
    }
}
