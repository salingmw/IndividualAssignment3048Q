package app.plantdiary.individualassignment3048q.dao

import app.plantdiary.individualassignment3048q.dto.Country
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ICountryDAO {

    @GET( "https://datahub.io/core/country-list/r/data.json")
    fun getAllCountries(): Call<ArrayList<Country>>
    @GET("https://datahub.io/core/country-list/r/data.json")
    fun getCountry(@Query( "Combined_Name" ) name: String) : Call<ArrayList<Country>>
}