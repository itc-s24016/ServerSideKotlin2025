package chap02
//式として記述する(when)
fun main() {
    println(getNumberText(100))
    println(getNumberText(300))
}

fun getNumberText(num: Int): String =
    when(num){
        100 -> {"Equal to 100"}
        200 -> {"Equal to 200"}
        else-> {"Undefined value"}
    }