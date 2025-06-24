package chap03
//Java のインターフェースを Kotlin で実装する(特殊)
fun main() {
    val function = CalcJava { num1, num2 -> num1 + num2 } //引数で足し算をする <- 処理内容を決める
    println(function.calc(1, 3))

    //こうもできる　※１
    executeCalc(1, 3){num1, num2 -> num1 + num2}
}
//※１
fun executeCalc(num1: Int, num2: Int, function: CalcJava) {
    println(function.calc(num1, num2))
}