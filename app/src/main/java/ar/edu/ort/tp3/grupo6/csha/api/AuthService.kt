package ar.edu.ort.tp3.grupo6.csha.api

import ar.edu.ort.tp3.grupo6.csha.api.model.LoginModel
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("/Login/authenticate")
    suspend fun login(@Body model: LoginModel)
}