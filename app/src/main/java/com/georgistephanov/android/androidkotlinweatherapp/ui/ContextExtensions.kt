package com.georgistephanov.android.androidkotlinweatherapp.ui

import android.content.Context
import android.support.v4.content.ContextCompat

fun Context.color(res: Int): Int = ContextCompat.getColor(this, res)