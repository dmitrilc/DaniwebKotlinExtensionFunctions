package com.example

fun main(){
    val maker = PizzaMaker()

    maker.makePepperoniPizza()
    maker.makeHawaiianPizza()

    maker.makeVeganPizza() //extensions
    maker.makeMeatLoverPizza() //extensions

    println(maker.count) //internal property
    println(maker.revenue) //extension property
}

class PizzaMaker() {

    var count: Int = 0

    fun makePepperoniPizza(){
        println("Pepperoni Pizza")
        count++
    }

    fun makeHawaiianPizza(){
        println("Hawaiian Pizza")
        count++
    }
}

//class PizzaMakerChild: PizzaMaker() {} //illegal

fun PizzaMaker.makeVeganPizza() {
    println("Vegan Pizza")
    count++
}

fun PizzaMaker.makeMeatLoverPizza(){
    println("Meat Lover")
    count++
}

val PizzaMaker.revenue: Int //$8 for each pizza
    get() = count * 8