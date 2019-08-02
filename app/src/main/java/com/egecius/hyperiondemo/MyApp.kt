package com.egecius.hyperiondemo

import android.app.Application
import hyperiondemo.initHyperionDeviceInfo

class MyApp : Application() {

    override fun onCreate() {
        initHyperionDeviceInfo()
        super.onCreate()
    }
}