


fun max(a:Int, b:Int):Int{
    return if(a > b) a else b
}

fun main(args : Array<String>){
    println(max(3,10))
    val name = if(args.size > 0) args[0] else "KOTLIN"
    println("home $name")

    if(args.size > 0) {
        println("hello , ${args[0]}")
    }

    println("hello , ${if(args.size > 0) args[0] else "somemoe"}!")

    val person = Person("Bob" , true)
    println(person.name)
    println(person.isMarried)

    val re = Rectangle(30,52)
    println(re.isSquare)

    println(Color.RED.rgb())


}

class Rectangle(val height : Int , val width:Int) {
    val isSquare : Boolean
    get() = height ==width

}

class Person (
        val name : String,
        val isMarried : Boolean
)

enum class Color (
    var r :Int ,
    var g :Int ,
    var b :Int

)
{

    RED(255,0,0), ORANGE(255,165,0) ,
    YELLOW (255,255,0), GREEN(0,255,0) ,
    BLUE(0,0,255) , INDIGO(75,0,130) , VIOLET(238,130,238);

    fun rgb() = (r*256+g)*256+b
}