package ar.edu.ort.tp3.grupo6.csha.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiModule {
    private val retrofit by lazy {
        val httpClient = OkHttpClient.Builder()
            .addInterceptor(AuthInterceptor())
            .build()

        Retrofit.Builder()
            .client(httpClient)
            .baseUrl("http://190.106.131.51:9658/api")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
}