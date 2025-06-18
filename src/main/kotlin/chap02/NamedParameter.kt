package chap02
//デフォルト引数(明示的)
data class User9(val id: Int, val name: String = "Default Name", val age: Int)

fun main() {
    //val user1 = User9(1, 30)
    //id と name だけを決めたいなら明示的にしないといけない
    val user = User9(id = 1, age = 30)
    println(user)
}