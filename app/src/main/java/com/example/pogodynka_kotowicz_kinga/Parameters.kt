package com.example.pogodynka_kotowicz_kinga

import android.widget.ImageView
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import org.json.JSONArray
import org.json.JSONObject

class Parameters{
    /*lateinit var coord: JSONArray
    var lon: String =""
    var lat: String=""
    lateinit var weather: JSONObject
    var w_id:Int=0
    var w_main:String=""
    var w_description:String=""
    var w_icon:String=""
    var base:String=""
    lateinit var main:JSONObject
    var m_temp:Double=0.0

    var visibility: String=""
    var wind: String=""
    var clouds: String=""
    var dt: Int=0
    var sys: String=""
    val date_and_time: String=""
    var id: Int=0
    //var name: String=""
    var cod: Int=0
*/
    @SerializedName("name") val name:String?=null
    @SerializedName("pressure") val pressure:Double?=null
    @SerializedName("description") val description:String?=null
    @SerializedName("temp") val temperature:Double?=null
    @SerializedName("timezone") val time:Double?=null
    //val temperature: String=""
    //val pressure: String=""
    //val icon: String=""

    //val description: String=""

    //fun getCityName_():String{
    //    return name
//}
    //fun getTemperature_():String{
    //    return temperature
    //}
    //fun getPressure_():String{
    //    return pressure
    //}
    //fun getIcon_():String{
    //    return icon
    //}
  //  fun getDateTime_():String{
  //      return date_and_time
  //  }
    //fun getDescription_():String{
    //    return description
    //}

}