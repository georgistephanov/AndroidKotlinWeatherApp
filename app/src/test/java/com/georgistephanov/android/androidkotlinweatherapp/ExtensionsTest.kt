package com.georgistephanov.android.androidkotlinweatherapp

import com.georgistephanov.android.androidkotlinweatherapp.ui.toDateString
import junit.framework.Assert.assertEquals
import org.junit.Test
import java.text.DateFormat

class ExtensionsTest {

    @Test
    fun testLongToDateString() {
        assertEquals("Oct 19, 2015", 1445275635000L.toDateString())
    }

    @Test fun testDateStringFullFormat() {
        assertEquals("Monday, October 19, 2015",
                1445275635000L.toDateString(DateFormat.FULL))
    }
}