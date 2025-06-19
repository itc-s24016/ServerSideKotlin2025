package chap02_10
//map の復習
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val idList = list.map { it * 10 }
    idList.forEach { println(it) }

    println("\n↓ convert(変換) ↓")
    val userList = listOf(
        User(id = 1, teamId = 100, name = "aaa"),
        User(id = 2, teamId = 200, name = "bbb"),
        User(id = 3, teamId = 300, name = "ccc")
    )
    val userIdList = userList.map { it.id }//int[] <- User[] でも大丈夫！
    userIdList.forEach { println(it) }
}