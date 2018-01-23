package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object JavaScript_Template : Template({
    uuid = "7b941104-cb76-4435-8d5d-339e953adbba"
    id = "JavaScript_Template"
    name = "Template"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    }

    steps {
        script {
            name = "npm install"
            id = "RUNNER_6"
            scriptContent = "npm install"
        }
        script {
            name = "Browser tests"
            id = "RUNNER_7"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false --reporters teamcity"
        }
        stepsOrder = arrayListOf("RUNNER_6", "RUNNER_7")
    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
