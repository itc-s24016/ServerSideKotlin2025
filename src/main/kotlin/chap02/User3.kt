package chap02
//lateinit
class User3 {
    //var age: Int
    //lateinit であとから初期値を決めることができる
    lateinit var name: String
}

class BadUser3() {
    //初期値を入れた場合
    var name: String = ""
}

fun main(){
    val user = User3()
    user.name = "名無し"
    println(user.name)

    val badUser = BadUser3()
    println(badUser.name)
}