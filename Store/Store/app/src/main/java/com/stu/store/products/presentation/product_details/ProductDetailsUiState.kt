package com.stu.store.products.presentation.product_details

import com.stu.store.products.domain.model.Product

data class ProductDetailsUiState(
    val product: Product = Product(),
    val isLoading: Boolean = true
)
