package com.georgistephanov.android.androidkotlinweatherapp.domain

import com.georgistephanov.android.androidkotlinweatherapp.data.ForecastRequest

class RequestForecastCommand(private val zipCode: Long) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(zipCode, forecastRequest.execute())
    }
}