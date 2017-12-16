package com.georgistephanov.android.androidkotlinweatherapp.domain

import com.georgistephanov.android.androidkotlinweatherapp.data.ForecastRequest

class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}