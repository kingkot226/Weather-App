package com.example.pogodynka_kotowicz_kinga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.RequestQueue
import com.android.volley.toolbox.BasicNetwork
import com.android.volley.toolbox.DiskBasedCache
import com.android.volley.toolbox.HurlStack
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        var layoutManager: LinearLayoutManager
        val recyclerview: RecyclerView =findViewById(R.id.largeWindowRecyclerView)

        recyclerview.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager=layoutManager

        var adapter=WeatherLargeAdapter()
        recyclerview.adapter=adapter

        var readAllData: MutableLiveData<List<Parameters>>
        readAllData = MutableLiveData()
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val jsonPH : ParametersService = retrofit.create(ParametersService::class.java)
        val call: Call<List<Parameters>> = jsonPH.getParameters()
        call.enqueue(object: Callback<List<Parameters>> {
            override fun onFailure(call: Call<List<Parameters>>, t: Throwable){

            }
            override fun onResponse(
                call: Call<List<Parameters>>,
                response: Response<List<Parameters>>
            ){
                if(!response.isSuccessful){
                    Toast.makeText(this@MainActivity,"test", Toast.LENGTH_LONG).show()
                }//response.code()
                readAllData.postValue(response.body())
                //val postList : List<Parameters> = response.body()!!
                //adapter.WeatherLargeAdapter(context = this@MainActivity, postList)
                //adapter.notifyDataSetChanged()

                //val adapter = PostAdapter(this@MainActivity, postList)
                //adapter.setData(readAllData)
                //val postAdapter:PostAdapter=PostAdapter(this@MainActivity,postList)
            }
        })
*/

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.host_fragment)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}