package chap02
//data クラスの復習(class)
class User6 {
    val id: Int = 1
    val name: String = "Kotlin"
}

fun main(){
    //ーーーーー　　おさらい　　ーーーーーー
    //同じ内容でインスタンスを生成
    val userA = User6()
    val userB = User6()

    //しかし、ハッシュ値が異なるため
    println(userA.hashCode())
    println(userB.hashCode())

    //同じではないと判定される
    println(userA == userB)
    //ーーーーーーーーーーーーーーーーーーー
}