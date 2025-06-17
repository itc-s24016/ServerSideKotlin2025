package chap02
//lateinit を使った getter のカスタマイズ
class User4 {
    lateinit var name: String
    val isValidName: Boolean
        get() = name != ""
}

fun main(){
    val user = User4()
    user.name = "名無し"
    println(user.isValidName)// true
    user.name = ""
    println(user.isValidName)// false
}