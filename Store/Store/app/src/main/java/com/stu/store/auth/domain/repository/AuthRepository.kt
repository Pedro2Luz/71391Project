package com.stu.store.auth.domain.repository

import arrow.core.Either
import com.stu.store.auth.domain.model.LoginRequest
import com.stu.store.auth.domain.model.LoginResponse
import com.stu.store.products.domain.model.NetworkError

interface AuthRepository {
    suspend fun login(loginRequest: LoginRequest): Either<NetworkError, LoginResponse>
}