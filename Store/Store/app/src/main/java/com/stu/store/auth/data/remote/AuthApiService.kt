package com.stu.store.auth.data.remote

import com.stu.store.auth.domain.model.LoginRequest
import com.stu.store.auth.domain.model.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {

    @POST("auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponse
}