package com.georgistephanov.android.androidkotlinweatherapp.ui

import android.app.Application

/**
 * Created by Georgi on 19-Dec-17.
 */
class App : Application() {
    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}