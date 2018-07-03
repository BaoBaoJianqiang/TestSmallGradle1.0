package com.jianqiang

import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('testPlugin') << {
            println "Hello gradle plugin in src"
        }
    }
}