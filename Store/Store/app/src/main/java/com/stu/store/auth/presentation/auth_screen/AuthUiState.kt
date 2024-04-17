package com.stu.store.auth.presentation.auth_screen

import com.stu.store.products.domain.model.ApiError

data class AuthUiState(
    val error: ApiError? = null,
    val loginIsSuccessful: Boolean = false,
    val isLoading: Boolean = false,
)