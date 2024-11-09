package com.javierma.kotlin.bookstore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
@EntityScan(basePackages = ["com.javierma.kotlin.Bookstore.domain"])
class KotlinBookstoreApplication

fun main(args: Array<String>) {
	runApplication<KotlinBookstoreApplication>(*args)
}
