package com.javierma.kotlin.bookstore.domain.entities

import jakarta.persistence.*

@Entity
@Table(name="authors")
@SequenceGenerator(name = "author_id_seq", sequenceName = "author_id_seq", allocationSize = 1)
data class AuthorEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    @Column(name="id")
    val id: Long? = null,  // Nota: Agregar un valor por defecto para id nullable

    @Column(name="name")
    val name: String,

    @Column(name="age")
    val age: Int,

    @Column(name="description")
    val description: String,

    @Column(name="image")
    val image: String,

    @OneToMany(mappedBy = "authorEntity", cascade = [CascadeType.REMOVE])
    val bookEntities: List<BookEntity> = emptyList(),
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AuthorEntity

        if (id != other.id) return false
        if (name != other.name) return false
        if (age != other.age) return false
        if (description != other.description) return false
        if (image != other.image) return false
        //return bookEntities == other.bookEntities
        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + name.hashCode()
        result = 31 * result + age
        result = 31 * result + description.hashCode()
        result = 31 * result + image.hashCode()
        result = 31 * result + bookEntities.hashCode()
        return result
    }
}
