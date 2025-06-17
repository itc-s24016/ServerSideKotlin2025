package jp.ac.it_college.std.s24016.kotlin
//条件分岐系(if, when)
import kotlin.random.Random

fun main() {
    println("( if )")
    ifExample(Random.nextInt(99, 101))
    ifExample(Random.nextInt(99, 101))
    ifExample(Random.nextInt(99, 101))
    println("\n( when )")
    whenExample(100)
    whenExample(200)
    whenExample(300)
}

fun ifExample(num: Int){
    if      (num < 100) { println("Less then 100") }
    else if (num == 100){ println("num is 100") }
    else                { println("Greater then 100") }
}

fun whenExample(num: Int){
    when (num){
        100 -> { println("Less then 100") }
        200 -> { println("Equal to 200") }
        else -> { println("Undefined value") }
    }
}