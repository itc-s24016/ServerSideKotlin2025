package chap02
//高階関数
//関数を引数とする関数
fun printResult(num1: Int, num2: Int, calc: (Int, Int) -> Int) {
    println( calc(num1, num2) )
}

typealias Calc = (Int, Int) -> Int
val calc2: Calc = { num1, num2 -> num1 + num2}
fun printResult2(num1: Int, num2: Int, calc: Calc) {
    println( calc(num1, num2) )
}

fun main() {
    //関数の中の関数の処理内容を決められる
    printResult(10, 5){num1, num2 -> num1 + num2} //calc の処理:10 + 5 = 15
    printResult(10, 5){num1, num2 -> num1 * num2} //calc の処理:10 * 5 = 50

    printResult2(10, 5){num1, num2 -> num1 * num2}
}