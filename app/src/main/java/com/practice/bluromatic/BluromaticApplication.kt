package com.practice.bluromatic

import android.app.Application
import com.practice.bluromatic.data.AppContainer
import com.practice.bluromatic.data.DefaultAppContainer

class BluromaticApplication : Application()  {

    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer(this)
    }
}