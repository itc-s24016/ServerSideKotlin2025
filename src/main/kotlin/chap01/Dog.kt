package jp.ac.it_college.std.s24016.kotlin
//継承の復習(サブクラス)
class Dog(name: String): Animal(name) {
    override fun cries() = println("bow wow!")
}
fun main(){
    val dog = Dog("子犬")
    //cries() を消したりすると値が変わる("bow wow!" or "default")
    dog.cries()
    dog.showName()
}