package com.example.android.covid_19tracker

enum class Metric {
    POSITIVE, NEGATIVE, DEATH
}

enum class TimeScale(val numDays : Int){
    WEEK(7),
    MONTH(30),
    MAXIMUM(-1)
}