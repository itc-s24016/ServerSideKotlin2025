package chap02
//式として記述する(if)
fun main() {
    //通常の実装方法
    printOddOrEvenNumberText(2)
    printOddOrEvenNumberText(3)

    //Kotlin 流の実装方法①
    printOddOrEvenNumberText2(2)
    printOddOrEvenNumberText2(3)
    //Kotlin 流の実装方法②
    println(getOddOrEvenNumberText(2))
    println(getOddOrEvenNumberText(3))
    //Kotlin 流の実装方法③
    println(getOddOrEvenNumberText2(2))
    println(getOddOrEvenNumberText2(3))

}
//通常の実装方法
fun printOddOrEvenNumberText(num: Int){
    var text = ""
    if (num % 2 ==1){ text = "奇数" }
    else            { text = "偶数" }
    println(text)
}
//Kotlin 流の実装方法①
fun printOddOrEvenNumberText2(num: Int){
    val text = if(num % 2== 1) "奇数" else "偶数"
    println(text)
}
//Kotlin 流の実装方法②
fun getOddOrEvenNumberText(num: Int): String {
    return if(num % 2 == 1) "奇数" else "偶数"
}
//Kotlin 流の実装方法③
fun getOddOrEvenNumberText2(num: Int): String = if (num % 2 == 1) "奇数" else "偶数"