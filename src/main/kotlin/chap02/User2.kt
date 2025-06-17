package chap02
//val でプロパティ宣言するということ
class User2 (val id: Int){
    var name: String = ""
}

fun main() {
    val user = User2(1)
    user.name = "名無し"
    //val で宣言する = 読み取り専用のプロパティなので、変更されない
    //故に、セッターが生成されない
}