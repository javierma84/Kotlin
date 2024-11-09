package com.javierma.kotlin.bookstore.domain.dto

data class AuthorUpdateRequestDto(

    val id: Long? = null,

    val name: String?,

    val age: Int?,

    val description: String?,

    val image: String?
)