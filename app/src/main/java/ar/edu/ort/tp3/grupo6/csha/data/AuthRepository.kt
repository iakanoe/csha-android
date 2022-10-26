package ar.edu.ort.tp3.grupo6.csha.data

import ar.edu.ort.tp3.grupo6.csha.api.AuthService

class AuthRepository(private val authService: AuthService) {
    suspend fun tryLogin(): Boolean {
        return true
    }
}