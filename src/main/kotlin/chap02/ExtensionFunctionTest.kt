package chap02
//引数の拡張関数のように呼び出す
//2乗する関数
fun square1(num: Int) = num * num

fun Int.square2() = this * this

fun main() {
    //引数の位置で拡張関数のようにできる
    println(square1(2))
    println(2.square2())
}