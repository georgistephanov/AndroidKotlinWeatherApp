package com.georgistephanov.android.androidkotlinweatherapp.ui

import android.content.Context
import android.view.View
import android.widget.TextView

val View.context: Context get() = context

var TextView.textColor: Int
    get() = currentTextColor
    set(v) = setTextColor(v)

fun View.slideExit() {
    if (translationY == 0f) animate().translationY(-height.toFloat())
}

fun View.slideEnter() {
    if (translationY < 0f) animate().translationY(0f)
}