package chap02
//data クラスの復習(data)
data class User7 (val id: Int = 1, val name: String = "Kotlin"){
    //data クラスでもクラスには変わりないのでメソッドが書ける
    val isValidName
            get() = name != ""
}

fun main(){
    //同じ内容でインスタンスを生成
    val userA = User7()
    val userB = User7()

    //ハッシュ値が同じになる
    println(userA.hashCode())
    println(userB.hashCode())

    //同じと判定される
    println(userA == userB)

    println(userA.isValidName)
    println(userB.isValidName)
}