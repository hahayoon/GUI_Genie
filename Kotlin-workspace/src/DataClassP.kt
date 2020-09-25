fun main() {
    val obj = User()
    println(obj)

    println(User("trdyfd"))

    println(User(age = 777))

}

data class User(
        var name: String = "코틀린",
        var age: Int = 123
)

