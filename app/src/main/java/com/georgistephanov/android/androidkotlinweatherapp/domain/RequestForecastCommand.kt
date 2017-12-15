package com.georgistephanov.android.androidkotlinweatherapp.domain

import com.georgistephanov.android.androidkotlinweatherapp.data.ForecastRequest

/**
 * Created by Georgi on 15-Dec-17.
 */
class RequestForecastCommand(val cityCode: String) : Command<ForecastList> {
    override fun execute() : ForecastList {
        val forecastRequest = ForecastRequest(cityCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}