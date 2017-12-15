package com.georgistephanov.android.androidkotlinweatherapp.domain

/**
 * Created by Georgi on 15-Dec-17.
 */
data class ForecastList(val city: String, val country: String, val dailyForecast: List<Forecast>)
data class Forecast(val date: String, val description: String, val high: Int, val low: Int)