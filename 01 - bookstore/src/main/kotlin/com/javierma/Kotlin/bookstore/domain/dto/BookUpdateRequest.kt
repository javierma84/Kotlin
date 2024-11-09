package com.javierma.kotlin.bookstore.domain.dto

data class BookUpdateRequest (
    val title: String? = null,
    val description: String? = null,
    val image: String? = null
)