package com.example.pogodynka_kotowicz_kinga

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class ParametersViewModel():ViewModel() {
    val readCityData: MutableLiveData<List<Parameters>>
    private val retroInstance: Retrofit
    private val parametersService: ParametersService
    private val repository: ParametersRepository

    init{
        readCityData = MutableLiveData()
        retroInstance = RetrofitClient.getRetroInstance()
        parametersService=retroInstance.create(ParametersService::class.java)
        repository = ParametersRepository(parametersService)
    }

    fun getCityDataObserver(): MutableLiveData<List<Parameters>> {
        return readCityData
    }

    fun getParametersDataCall(){

        var call = repository.getParametersList("Warszawa")
        call.enqueue(object: Callback<List<Parameters>> {
            override fun onFailure(call: Call<List<Parameters>>, t: Throwable){
                readCityData.postValue(null)
            }

            override fun onResponse(
                call: Call<List<Parameters>>,
                response: Response<List<Parameters>>
            ){
                readCityData.postValue(response.body())
            }
        })
    }
}