package com.georgistephanov.android.androidkotlinweatherapp.domain

/**
 * Created by Georgi on 15-Dec-17.
 */
public interface Command<out T> {
    fun execute(): T
}