package com.stu.store.products.presentation.seacrh

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import com.stu.store.products.domain.model.Product
import com.stu.store.products.presentation.home_screen.ProductList

@Composable
fun SearchScreen(
    searchedProducts: List<Product>,
    paddingValues: PaddingValues,
    onNavigateToProductDetails: (Int) -> Unit
) {
    ProductList(
        products = searchedProducts,
        onClickProduct = onNavigateToProductDetails,
        paddingValues = paddingValues
    )
}