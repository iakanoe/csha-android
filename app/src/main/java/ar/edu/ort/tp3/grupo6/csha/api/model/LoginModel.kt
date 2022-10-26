package ar.edu.ort.tp3.grupo6.csha.api.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LoginModel(
    @Json(name = "documento_tipo_cod") val documentType: String,
    @Json(name = "documento_nro") val documentNumber: String,
    @Json(name = "clave_app") val password: String,
    @Json(name = "email") val email: String
)
