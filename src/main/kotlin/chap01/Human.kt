package jp.ac.it_college.std.s24016.kotlin
//クラスとインスタンスの復習
class Human(val name: String) {
    fun showName(name: String) = println(name)
    fun showName()             = println(name)
}

fun main() {
    /*
    クラスを使う -> インスタンスを生成する必要がある
    インスタンス -> クラス名() でコンストラクタを呼び出せる
    */
    val human = Human("this プロパティ")

    human.showName("demo name")
    human.showName()//引数なしはプロパティに入っている値(this プロパティ)を返す
}