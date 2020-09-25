fun main(args: Array<String>) {

    val obj = Customer()
    obj.fullname = "코틀린"
    println(obj.fullname )

}

class Customer() {
   var fullname : String = ""
}

