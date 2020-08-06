package com.github.lonelycod.prraiseridea.services

import com.intellij.openapi.project.Project
import com.github.lonelycod.prraiseridea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
