package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "163dfc55-d9c7-4821-961d-3c573bf6684f"
    id = "JavaScript"
    parentId = "_Root"
    name = "JavaScript"

    vcsRoot(JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    buildType(JavaScript_03Deploytostaging)
    buildType(JavaScript_02Chrome)
    buildType(JavaScript_02Firefox)
    buildType(JavaScript_01FastTests)

    template(JavaScript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "Javascriptsettings"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
