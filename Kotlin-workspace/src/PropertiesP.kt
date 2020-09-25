fun main() {
  var obj = Address()
    println(obj.name)
}

class Address {
    var name :String = "코틀린"
    get(){
        return field + "!!!"
    }
    set(value) { field = value }

}
