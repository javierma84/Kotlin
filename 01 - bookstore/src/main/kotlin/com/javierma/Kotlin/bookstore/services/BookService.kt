package com.javierma.kotlin.bookstore.services

import com.javierma.kotlin.bookstore.domain.BookSummary
import com.javierma.kotlin.bookstore.domain.dto.BookUpdateRequest
import com.javierma.kotlin.bookstore.domain.entities.BookEntity

interface BookService {

    fun createUpdate(isbn: String, bookSummary: BookSummary): Pair<BookEntity, Boolean>

    fun list(authorId: Long? = null): List<BookEntity>

    fun get(isbn: String): BookEntity?

    fun partialUpdate(isbn: String, bookUpdateRequest: BookUpdateRequest): BookEntity

    fun delete(isbn: String)

}