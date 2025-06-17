package jp.ac.it_college.std.s24016.kotlin
//継承の復習
//継承させたいときはクラス名の頭に open をつける
open class Animal(val name: String) {

    fun showName() = println("name is ${name}")

    //Dogクラスで何も記述がない場合に、ここが実行される
    open fun cries() = println("default")
}