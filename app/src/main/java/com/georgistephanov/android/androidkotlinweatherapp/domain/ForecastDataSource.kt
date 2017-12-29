package com.georgistephanov.android.androidkotlinweatherapp.domain

interface ForecastDataSource {
    fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList?
}