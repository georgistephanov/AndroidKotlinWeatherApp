package com.georgistephanov.android.androidkotlinweatherapp.domain

import com.georgistephanov.android.androidkotlinweatherapp.data.Forecast
import com.georgistephanov.android.androidkotlinweatherapp.data.ForecastResult
import java.text.DateFormat
import java.util.*
import java.util.concurrent.TimeUnit
import com.georgistephanov.android.androidkotlinweatherapp.domain.Forecast as ModelForecast

class ForecastDataMapper {

    fun convertFromDataModel(zipCode: Long, forecast: ForecastResult) = with(forecast) {
        ForecastList(zipCode, city.name, city.country, convertForecastListToDomain(list))
    }

    private fun convertForecastListToDomain(list: List<Forecast>): List<ModelForecast> {
        return list.mapIndexed { i, forecast ->
            val dt = Calendar.getInstance().timeInMillis + TimeUnit.DAYS.toMillis(i.toLong())
            convertForecastItemToDomain(forecast.copy(dt = dt))
        }
    }

    private fun convertForecastItemToDomain(forecast: Forecast) = with(forecast) {
        ModelForecast(dt, weather[0].description, temp.max.toInt(), temp.min.toInt(),
                generateIconUrl(weather[0].icon))
    }

    private fun generateIconUrl(iconCode: String) = "http://openweathermap.org/img/w/$iconCode.png"
}