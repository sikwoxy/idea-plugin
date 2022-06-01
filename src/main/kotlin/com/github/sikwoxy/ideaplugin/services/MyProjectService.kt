package com.github.sikwoxy.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.sikwoxy.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
