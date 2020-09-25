package com.example.kotlin1

class Book private constructor (val id : Int , val name : String) {

    companion object BookFactory : IdProvider{  // companion object  자바의 static 역할

        override fun getId(): Int {  //상속 오버라이드
            return 444
        }

        val name ="이기적"
        fun create(): Book = Book(getId(), name)



    }
}

interface  IdProvider {
    fun getId():Int
}





fun main() {
    val book = Book.create()
    println("${book.id} ${book.name}")

    val bookId = Book.BookFactory.getId()






}