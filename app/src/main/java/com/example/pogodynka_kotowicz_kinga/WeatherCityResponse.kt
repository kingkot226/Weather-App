package com.example.pogodynka_kotowicz_kinga

import com.google.gson.annotations.SerializedName

data class WeatherCityResponse (

    @field:SerializedName("weather")
    val weather: List<WeatherItem?>? = null,

    @field:SerializedName("main")
    val main: Main? = null,

    @field:SerializedName("sys")
    val sys: Sys? = null,

    @field:SerializedName("timezone")
    val id: Int? = null,

    @field:SerializedName("name")
    val name: String? = null

)

    data class WeatherItem(

        @field:SerializedName("main")
        val main: String? = null,

        @field:SerializedName("description")
        val description: String? = null,

        @field:SerializedName("icon")
        val icon: String? = null,

        @field:SerializedName("id")
        val id: Int? = null
    )

    data class Main(

        @field:SerializedName("temp")
        val temp: Double? = null,

        @field:SerializedName("pressure")
        val pressure: Double? = null
    )

    data class Sys(

        @field:SerializedName("sunrise")
        val sunrise: Int? = null,

        @field:SerializedName("sunset")
        val sunset: Int? = null
    )