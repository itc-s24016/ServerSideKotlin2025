package chap02
//デフォルト引数
fun printUserInfo(id: Int, name: String = "Default Name"){
    println("id: ${id}, name: ${name}")
}

data class User8(val id: Int, val name: String = "Default Name")

fun main() {
    //コンストラクタで初期値を決めておくと、あとで宣言するしないを決められる
    //id: 宣言必須, name: どちらでも
    printUserInfo(1)
    printUserInfo(2, "名無し")

    val user = User8(1)
    println(user)
}