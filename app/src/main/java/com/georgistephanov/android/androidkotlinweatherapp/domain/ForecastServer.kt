package com.georgistephanov.android.androidkotlinweatherapp.domain

import com.georgistephanov.android.androidkotlinweatherapp.data.ForecastByZipCodeRequest
import com.georgistephanov.android.androidkotlinweatherapp.data.db.ForecastDb

class ForecastServer(private val dataMapper: ServerDataMapper = ServerDataMapper(),
                     private val forecastDb: ForecastDb = ForecastDb()) : ForecastDataSource {
    override fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList? {
        val result = ForecastByZipCodeRequest(zipCode).execute()
        val converted = dataMapper.convertToDomain(zipCode, result)
        forecastDb.saveForecast(converted)
        return forecastDb.requestForecastByZipCode(zipCode, date)
    }
}