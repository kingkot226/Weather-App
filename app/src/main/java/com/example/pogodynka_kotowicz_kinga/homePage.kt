package com.example.pogodynka_kotowicz_kinga

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import android.widget.SearchView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.BasicNetwork
import com.android.volley.toolbox.DiskBasedCache
import com.android.volley.toolbox.HurlStack
import com.android.volley.toolbox.JsonObjectRequest
import com.bumptech.glide.Glide
import com.example.pogodynka_kotowicz_kinga.databinding.FragmentHomePageBinding
import java.lang.reflect.Array
import retrofit2.Retrofit


class homePage : Fragment() {


    // val url="http://api.openweathermap.org/data/2.5/weather?q=${city_name},pl&APPID=f21cf9df063338bafe111e27eb78983b"
    private val args by navArgs<homePageArgs>()
    private var layoutManager: GridLayoutManager? = null
    private lateinit var viewModel:ParametersViewModel
    private var _binding: FragmentHomePageBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        requireActivity().window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        _binding = FragmentHomePageBinding.inflate(inflater,container,false)
        val _cn=args.cn

        val largeadapterView = binding.largeWindowRecyclerView
        val adapter = WeatherLargeAdapter()
        layoutManager = GridLayoutManager(activity, 1)
        largeadapterView.layoutManager = layoutManager
        largeadapterView.adapter = adapter

        viewModel = ViewModelProvider(this)[ParametersViewModel::class.java]

        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        viewModel.getCityDataObserver().observe(viewLifecycleOwner, Observer {
            if(it!=null){
                adapter.setData(it)
                adapter.notifyDataSetChanged()
                Toast.makeText(context, "OK", Toast.LENGTH_SHORT).show()

            }
            else{
                Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
            }
        })
        viewModel.getParametersDataCall()

        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}