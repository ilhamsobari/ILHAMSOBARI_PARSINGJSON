package id.ac.pelitabangsa.ilhamsobari_parsingjson.network

import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class apiconfig {
    companion object{
        fun getapiservice():apiservice {
            val logginInterceptor =
                    HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            val client = okhttpClient.Builder()
                    .addInterceptor(logginInterceptor)
                    .build()
            val retrofit = Retrofit.Builder()
                    .baseUrl("https://reqres.in/")
                    .addCallAdapterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build()
            return retrofit.create(apiservice::class.java)
        }
    }
}