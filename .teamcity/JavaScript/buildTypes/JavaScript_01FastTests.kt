package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_01FastTests : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "2e9b98da-d808-4894-bad0-d0b14b721f44"
    id = "JavaScript_01FastTests"
    name = "01. Fast tests"

    params {
        param("Browser", "PhantomJS")
    }
})
