package jp.ac.it_college.std.s24016.kotlin
//デバッグのステップインの使い方と単一式の場合の関数の書き方
fun main() {
    val length = countLength("Server Side Kotlin")
    displayMessage("Server Side Kotlin: ${length}")
}
/*
    【 関数の基本 】
    fun 関数名( 引数: 型 ): 戻り値の型
*/
//単一式
fun countLength(str: String): Int = str.length
/*
fun countLength(str: String): Int {
    return str.length
}
*/

//println を格納してあるだけの関数
fun displayMessage(message: String){
    println(message)
}
