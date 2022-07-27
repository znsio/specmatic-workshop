package com.specmatic.workshop.products.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class Products {
    @GetMapping("/products/{productId}")
    fun details(@PathVariable productId: String) = Product("book", "book_sku4")
}

data class Product(val name: String, val sku: String)