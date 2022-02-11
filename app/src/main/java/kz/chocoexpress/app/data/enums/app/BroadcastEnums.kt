package kz.chocoexpress.app.data.enums.app

import kz.chocoexpress.app.BuildConfig

enum class BroadcastEnums(val id: String) {

    FOREGROUND_PUSH("${BuildConfig.APPLICATION_ID}.foreground_push")

}