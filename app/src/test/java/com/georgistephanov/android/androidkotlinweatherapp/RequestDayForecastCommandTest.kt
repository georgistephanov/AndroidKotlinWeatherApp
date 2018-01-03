package com.georgistephanov.android.androidkotlinweatherapp

import com.georgistephanov.android.androidkotlinweatherapp.domain.ForecastProvider
import com.georgistephanov.android.androidkotlinweatherapp.domain.RequestDayForecastCommand
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class RequestDayForecastCommandTest {
    @Test
    fun testProviderIsCalled() {
        val forecastProvider = mock(ForecastProvider::class.java)
        val command = RequestDayForecastCommand(2, forecastProvider)

        command.execute()

        verify(forecastProvider).requestForecast(2)
    }
}