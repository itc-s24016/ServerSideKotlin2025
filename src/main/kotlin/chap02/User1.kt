package chap02
//エラーの原因が確定するまで停止中
//class User1 {
//    var name: String = ""
//
//    //ゲッターセッター
//    fun getName() : String {
//        return name
//    }
//    fun setName(name: String) {
//        this.name = name
//    }
//}
////Kotlin のコンパイラがプロパティのアクセサリメソッドを生成するのでメソッドの宣言が重複するためエラーになる
//fun main() {
//    val user = User1()
//    user.name = "NoName"
//    println(user.name)
//}