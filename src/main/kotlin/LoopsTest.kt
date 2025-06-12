package jp.ac.it_college.std.s24016.kotlin
//繰り返し系(while, for, repeat)
fun main() {
    var i = 1

    println("( while loop )")
    while (i < 10){
        println("i in ${i}")
        i++
    }

    println("\n( for loop 1 )")
    for (i in 1..10) {
        println("i in ${i}")
    }

    println("\n( for loop 2 )")
    for (i in 1..10 step 2){
        println("i in ${i}")
    }

    println("\n( for loop 3 )")
    val list = listOf(1, 2, 5, 6, 10)
    for (i in list){
        println("i in ${i}")
    }

    println("\n( repeat loop function )")
    repeat(10, {println("i is ${it}")})
}