package com.nathaniel.appbundlesideload

import android.app.Application
import com.google.android.play.core.missingsplits.MissingSplitsManagerFactory

class BaseApplication : Application() {
    override fun onCreate() {
        if (MissingSplitsManagerFactory.create(this).disableAppIfMissingRequiredSplits()) {
            return
        }
        super.onCreate()
    }
}