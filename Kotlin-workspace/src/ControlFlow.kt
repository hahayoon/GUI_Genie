fun main(args: Array<String>) {
    val myData = MyData();
    for (item in myData) {
        print(item)
    }
    var a = listOf(1, 2, 3)
    println(a)

    foo3()

}

fun foo() {
    var ints = listOf(0, 7, 8, 9)
    ints.forEach label@{

        if (it == 7) return@label
        print(it)
    }

    print("end")
}

fun foo2() {
    var ints = listOf(0, 7, 8, 9)
    ints.forEach {

        if (it == 7) return@forEach
        print(it)
    }
    print("end")
}

fun foo3() {
    var ints = listOf(0, 7, 8, 9)
    ints.forEach (
        fun(value: Int) {
            if (value == 7) return
            print(value)
        }
    )
    print("end")
}


class MyIteator {
    val data = listOf(1, 2, 3, 4, 5)
    var idx = 0

    operator fun hasNext(): Boolean {
        return data.size > idx
    }

    operator fun next(): Int {
        return data[idx++]
    }
}


class MyData {
    operator fun iterator(): MyIteator {
        return MyIteator()
    }
}