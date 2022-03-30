package com.example.pogodynka_kotowicz_kinga

import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ParametersService {
        //@GET("weather/?q=Warszawa,lang=pl&APPID=f21cf9df063338bafe111e27eb78983b")
        //fun getParameters(): Call<List<Parameters>>

        @GET("weather/?q=Warszawa,lang=pl&APPID=f21cf9df063338bafe111e27eb78983b")
        fun getParametersOfCity(
                //@Query("q") q: String,
                //@Query("lang") units: String = "pl",
                //@Query("appid") appid: String = "f21cf9df063338bafe111e27eb78983b"
        ): Call<List<Parameters>>

}



