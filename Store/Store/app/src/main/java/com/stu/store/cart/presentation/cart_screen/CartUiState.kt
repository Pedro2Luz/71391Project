package com.stu.store.cart.presentation.cart_screen

import com.stu.store.cart.domain.model.ProductSimple

data class CartUiState(
    val products: List<ProductSimple> = emptyList(),
    val subtotal: Double = 0.0,
    val isLoading: Boolean = false
)
