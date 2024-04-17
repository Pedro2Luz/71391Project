package com.stu.store.cart.mapper

import com.stu.store.cart.domain.model.ProductSimple
import com.stu.store.products.domain.model.Product

fun Product.toProductSimple(quantity: Int): ProductSimple {
    return  ProductSimple(
        id = id,
        title = title,
        image = image,
        price =  price,
        quantity = quantity
    )
}