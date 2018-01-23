package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_02Firefox : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "98c29e8d-8227-40d0-adbc-8adb6ecf2e6a"
    id = "JavaScript_02Firefox"
    name = "02. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
