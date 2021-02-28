package app.plantdiary.individualassignment3048q.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.plantdiary.individualassignment3048q.dto.Country
import app.plantdiary.individualassignment3048q.service.CountryService
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainViewModel : ViewModel() {

//    private var _countries: MutableLiveData<ArrayList<Country>> = MutableLiveData<ArrayList<Country>>()
//    private var _country = Country()
//
//    private val baseUrl = "https://pkgstore.datahub.io"
//    private val retrofit = Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(
//        GsonConverterFactory.create()).build()
//    private val service = retrofit.create(CountryService::class.java)
//
//
//
//    fun fetchCountries() {
//        viewModelScope.launch {service.getCountryList()}
//    }
//
//    internal var countries: MutableLiveData<ArrayList<Country>>
//        get() { return _countries}
//        set(value) {_countries = value}
//
//    internal var country: Country
//        get() {return _country}
//        set(value) {_country = value}

    var countries: MutableLiveData<ArrayList<Country>> = MutableLiveData<ArrayList<Country>>()
    var countryService: CountryService = CountryService()

    fun fetchCountries(countryName: String) {
        countries = countryService.fetchCountries(countryName)
    }

}

