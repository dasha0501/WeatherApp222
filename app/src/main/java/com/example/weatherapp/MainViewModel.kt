package com.example.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp.Adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDatCurrent = MutableLiveData<WeatherModel>()
    val liveDatList = MutableLiveData<List<WeatherModel>>()


}