package ar.edu.ort.tp3.grupo6.csha.api

import ar.edu.ort.tp3.grupo6.csha.data.Session
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        if (Session.loggedIn) {
            request = request.newBuilder()
                .header("sToken", Session.token)
                .build()
        }

        return chain.proceed(request)
    }
}