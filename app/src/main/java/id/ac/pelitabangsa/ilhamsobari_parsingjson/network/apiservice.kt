package id.ac.pelitabangsa.ilhamsobari_parsingjson.network

import id.ac.pelitabangsa.ilhamsobari_parsingjson.model.responuser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface apiservice {
    //menampilkan user dengan query
    @GET("api/user")
    fun getListUsers(@Query("page")page: String): Call<responuser>
}