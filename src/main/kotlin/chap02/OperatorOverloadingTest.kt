package chap02
//演算子のオーバーロード
data class Num(val value: Int){
    operator fun plus(num: Num) = Num(value + num.value) // +
    operator fun minus(num: Num) = Num(value - num.value)// -
    operator fun times(num: Num) = Num(value * num.value)// ×
    operator fun div(num: Num) = Num(value / num.value)  // ÷

    operator fun compareTo(num: Num) = value.compareTo(num.value)// <==>

    operator fun unaryPlus() = Num(+value) // +a
    operator fun unaryMinus() = Num(-value)// -a
    operator fun not() = Num(-value)       // !a
}

fun main(){
    val num2 = Num(2)
    val num3 = Num(3)

    /* ( operator = 演算子 )
    ここで足し算をしようとすると、エラーになる
    val sum = num2 + num3

    （原因）
    StringやIntなど、もともとある型はできるけど、自作の型ではできないから
    */

    println(num2 + num3) // ↑ sum = num2.plus(num3) 実際の動きはこう
    println(num2 - num3)
    println(num2 * num3)
    println(num3 / num2)

    println(num3 > num2)
    println(num3 < num2)
    println(num3 == num2)
}