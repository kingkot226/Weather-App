package com.example.pogodynka_kotowicz_kinga

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class WeatherLargeAdapter : RecyclerView.Adapter<WeatherLargeAdapter.parameters_list_holder>(){

    //private var _categoriesList = emptyList<Category>()
    var parameters_list= emptyList<Parameters>()
    var context: Context ?= null
    //private var _cn: String = "Warszawa"

   // fun WeatherLargeAdapter(context: Context, param:List<Parameters>){
   //     this.context=context
   //     parameters_list=param
   // }

    inner class parameters_list_holder(view: View) : RecyclerView.ViewHolder(view) {
        val city_name: TextView = view.findViewById(R.id.textview_cityname)
        val temperature: TextView = view.findViewById(R.id.textview_temperature)
        val datetime: TextView = view.findViewById(R.id.textview_time)
        val icon: ImageView = view.findViewById(R.id.imageview_icon)
        val adapterLarge: ConstraintLayout = view.findViewById(R.id.layout_weather_largeadapter)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): parameters_list_holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.weather_large_adapter,parent,false) as View
        return parameters_list_holder(view)
    }

    override fun onBindViewHolder(holder: parameters_list_holder, position: Int) {
        val currentCity = parameters_list.get(position)
        holder.city_name.text=currentCity.name
        holder.temperature.text=currentCity.temperature.toString()
        holder.datetime.text=currentCity.time.toString()
        //Picasso.get().load(currentCity.icon).into(holder.icon)
        //holder.adapterLarge.setOnClickListener {
          //  val action = homePageDirections.actionHomePageToWeatherPage(cn =  currentCity.city_name)
          //  holder.itemView.findNavController().navigate(action)
        //}
    }

    override fun getItemCount(): Int {
        return parameters_list.size
    }

    fun setData(parameters: List<Parameters>){
        this.parameters_list = parameters
        //this._cn=cn
        notifyDataSetChanged()
    }
}