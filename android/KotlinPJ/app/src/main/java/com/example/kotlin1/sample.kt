package com.example.kotlin1

//변수명을 타입보다 먼저 써준다.

fun nullcheck(){
    //npm :null point Exception

    var name = "yooon"

    var nullname : String ?= null

    var nameInUppercase = name.toUpperCase()
    var nullnameInUppercase = nullname?.toUpperCase()


    //?: 엘비스 연산자

    val lastName : String ?= null

    val fullname : String = name + (lastName ?:  " no last name")
    println(fullname)
}

// !! (null 이 아니야)

fun ignoreNull(str: String?){

    val mNotNull : String = str!!
    println(str)
    val upper: String = mNotNull.toUpperCase()



//LET 함수
    val email : String ?= "javaking@navar.com"
    email?.let{
         println("email is $email")
    }
}





//반복문
//for
//while

fun forAndWhile(){
    val student : ArrayList<String> = arrayListOf("joyice" , "james" , "jenny" , "jennifer")

    for(name in student) {
        println("${name}")
    }

    for((index , name)in student.withIndex()){
        println("${index+1} 번째 학색 이름은 ${name}")
    }

    var sum = 0
    for(i in 1..10 step 2){  //step , downto , until(마지막꺼 빼고 )
    sum +=i
    }
    println(sum)


    var index = 0

    while(index < 3){
        println(index)
        index += 1
    }


}



//array vs list
//array :  메모리가 이미 할당되어있어 처음에 크기를 지정해준다.
//list : 1.List(읽기전용 ) , 2. MutableList (수정가능)

fun array(){
    val array:Array<Int> = arrayOf(1,2,3)
    val list : List<Int> = listOf(3,2,1)

    val array2 : Array<Any> = arrayOf(1,"g",30.5)

    array[0] = 3
    //list[0] = 2 //못해

    var arrayList :ArrayList<Int> = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)





 }

fun main() {
    ignoreNull("yoon")

    nullcheck()

    forAndWhile()
    // helloWorld()
    // println(add(4, 5))

    //3.String template
    //CheckNum(1)


    val name = "yoon"
    println("my name is $name")
    val lastName = "LEE"
    println("my name is ${name + lastName} ")
}

    //4. 조건식
    fun maxBy(a:Int ,b:Int) : Int {
        if(a > b) {
            return a
        }
        else {
            return b
        }
    }

    fun maxBy2 (a:Int, b:Int) : Int = if(a>b) a else b

    fun CheckNum(score : Int){ //fun 은 when 에 else 를 안써도 된다.
        when(score) {
            0 -> println("this is 0")
            1 -> println("this is 1")
            2,3 -> println("this is 2")

        }

        var b = when(score){  //else 룰 써주어야한다.
            1 -> 1
            2 -> 2
            else -> 3
        }

        println("b = $b")

        when(score){
            in 90..100 -> println("good")
            in 10..90 -> println("soso")
            else-> println("ok")
        }
    }




fun helloWorld(): Unit {  //리턴타입이 없으면 생략이 가능하다.
    println("hello world ")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

//val = value => 바뀌지 않는것

fun hi() {
    val a: Int = 10
    var b: Int = 5

//    a=100  => 재정의 될수 없다 . (에러)
    b = 100 //가능

    val c = 100 //int 라고 따로 명시 하지 않아도 된다.
    var d = 200
    var name = "Yoon" //Strin으로 자동 추론해줌.


}

