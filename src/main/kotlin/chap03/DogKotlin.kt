package chap03
//Java のクラスを Kotlin でオーバーライドする
class DogKotlin : AnimalJava() {
    override fun cry() {
        println("bow Wow!")
    }
}

fun main() {
    val dog = DogKotlin()
    dog.cry()
}