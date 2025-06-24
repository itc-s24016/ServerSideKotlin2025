package chap02
//coroutine(async, await)
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val result = async {
        delay(2000L)
        var sum = 0
        for (i in 1..10){
            sum += i
        }
        sum
    }
    println("計算中")
    println("sum = ${result.await()}")

    val num1 = async {
        delay(2000L)
        3 + 4
    }
    val num2 = async {
        delay(1000L)
        3 + 4
    }
    println("sum = ${num1.await() + num2.await()}")
}