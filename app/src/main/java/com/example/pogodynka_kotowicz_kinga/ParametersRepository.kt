package com.example.pogodynka_kotowicz_kinga

import android.security.identity.ResultData
import kotlinx.coroutines.flow.Flow
import retrofit2.Call
import retrofit2.Response

class ParametersRepository(private val parametersService: ParametersService) {

    fun getParametersList(city: String): Call<List<Parameters>> {
        return parametersService.getParametersOfCity()
    }
}