package com.georgistephanov.android.androidkotlinweatherapp

import android.util.Log
import java.net.URL

/**
 * Created by Georgi on 14-Dec-17.
 */
class Request(val url : String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }

}