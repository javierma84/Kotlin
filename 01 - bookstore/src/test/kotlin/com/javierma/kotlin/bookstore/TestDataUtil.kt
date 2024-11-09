package com.javierma.kotlin.bookstore

import com.javierma.kotlin.bookstore.domain.AuthorSummary
import com.javierma.kotlin.bookstore.domain.AuthorUpdateRequest
import com.javierma.kotlin.bookstore.domain.BookSummary
import com.javierma.kotlin.bookstore.domain.dto.AuthorDto
import com.javierma.kotlin.bookstore.domain.dto.AuthorSummaryDto
import com.javierma.kotlin.bookstore.domain.dto.AuthorUpdateRequestDto
import com.javierma.kotlin.bookstore.domain.dto.BookSummaryDto
import com.javierma.kotlin.bookstore.domain.entities.AuthorEntity
import com.javierma.kotlin.bookstore.domain.entities.BookEntity

const val BOOK_A_ISBN = "978-089-230342-0777"
fun testAuthorDtoA(id: Long? = null) =
    AuthorDto(
        id = id,
        name = "John Doe",
        age = 30,
        description = "some description",
        image = "author-image.jpeg"
    )

fun testAuthorEntityA(id: Long? = null) =
    AuthorEntity(
        id = id,
        name = "John Doe",
        age = 30,
        description = "some description",
        image = "author-image.jpeg"
    )

fun testAuthorEntityB(id: Long? = null) =
    AuthorEntity(
        id = id,
        name = "Don Joe",
        age = 65,
        description = "some other description",
        image = "some-other-author-image.jpeg"
    )

fun testAuthorSummaryDtoA(id: Long) = AuthorSummaryDto(
    id = id,
    name = "John Doe",
    image = "author-image.jpeg"
)

fun testAuthorSummaryA(id: Long) = AuthorSummary(
    id = id,
    name = "John Doe",
    image = "author-image.jpeg"
)

fun testAuthorUpdateRequestDtoA(id: Long? = null) =
    AuthorUpdateRequestDto(
        id = id,
        name = "John Doe",
        age = 30,
        description = "some description",
        image = "author-image.jpeg"
    )

fun testAuthorUpdateRequestA(id: Long? = null) =
    AuthorUpdateRequest(
        id = id,
        name = "John Doe",
        age = 30,
        description = "some description",
        image = "author-image.jpeg"
    )

fun testBookEntityA(isbn: String, author: AuthorEntity) = BookEntity(
    isbn = isbn,
    title = "Test Book A",
    description = "A test book",
    image = "book-image.jpeg",
    authorEntity = author
)

fun testBookSummaryDtoA(isbn: String, author: AuthorSummaryDto) = BookSummaryDto(
    isbn = isbn,
    title = "Test Book A",
    description = "A test book",
    image = "book-image.jpeg",
    author = author
)

fun testBookSummaryA(isbn: String, author: AuthorSummary) = BookSummary(
    isbn = isbn,
    title = "Test Book A",
    description = "A test book",
    image = "book-image.jpeg",
    author = author
)

fun testBookSummaryB(isbn: String, author: AuthorSummary) = BookSummary(
    isbn = isbn,
    title = "Test Book B",
    description = "Another test book",
    image = "book-image-b.jpeg",
    author = author
)
