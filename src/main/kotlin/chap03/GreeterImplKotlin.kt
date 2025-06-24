package chap03

import chap01.Greeter

//Java のインターフェースを Kotlin で実装する
class GreeterImplKotlin: GreeterJava {
    override fun hello() {
        println("Hello!")
    }
}

fun main(){
    val greeter = GreeterImplKotlin()
    greeter.hello()
}