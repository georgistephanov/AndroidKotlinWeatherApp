package com.georgistephanov.android.androidkotlinweatherapp.domain

public interface Command<out T> {
    fun execute(): T
}