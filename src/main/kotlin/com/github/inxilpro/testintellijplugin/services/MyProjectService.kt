package com.github.inxilpro.testintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.inxilpro.testintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
