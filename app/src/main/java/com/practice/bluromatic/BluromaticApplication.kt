package com.practice.bluromatic

import android.app.Application
import com.practice.bluromatic.data.AppContainer
import com.practice.bluromatic.data.DefaultAppContainer

class BluromaticApplication : Application()  {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer(this)
    }
}