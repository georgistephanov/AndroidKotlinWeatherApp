package com.georgistephanov.android.androidkotlinweatherapp.data

import com.google.gson.Gson
import java.net.URL

/**
 * Created by Georgi on 15-Dec-17.
 */
class ForecastRequest(val cityCode: String) {

    companion object {
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce&id=2643743"
        private val URL = "http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&APPID=$APP_ID&id="
    }

    fun execute(): ForecastResult {
        val forecastJsonStr = URL(COMPLETE_URL + cityCode).readText()
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }

}