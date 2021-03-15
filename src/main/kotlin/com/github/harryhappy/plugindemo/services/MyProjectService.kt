package com.github.harryhappy.plugindemo.services

import com.github.harryhappy.plugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
