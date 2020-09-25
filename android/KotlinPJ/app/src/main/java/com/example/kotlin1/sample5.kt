package com.example.kotlin1

object CarFactory {  //싱글턴 패턴
    var cars = mutableListOf<Car>()


    fun makeCar(Power: Int): Car {
        val car = Car(Power)
        cars.add(car)
        return car
    }
}

data class Car(var Power: Int)

fun main() {
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(30)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())

}