package app.plantdiary.individualassignment3048q.dto

import android.app.usage.UsageEvents
import com.google.gson.annotations.SerializedName


data class Country(
    @SerializedName("Code") var code: String = "",
    @SerializedName("Name") val name: String = "")
{

    override fun toString(): String {
        return "$name $code";
    }

}