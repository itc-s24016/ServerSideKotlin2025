package chap02_10
//filter の復習
fun main() {
    val list = listOf(
        User(1, 100, "Kotlin"),
        User(2, 100, "Java"),
        User(3, 100, "Scala"),
        User(4, 200, "Swift"),
        User(5, 300, "C++"),
    )

    //list.filter{ここの中に <==> 等の戻り値が boolean になる処理を書く}
    //※true のものだけ返すので注意 false にしたい場合は !() で囲むといい
    val teamId_100 = list.filter { it.teamId == 100 }
    teamId_100.forEach { println(it) }

    //filter で作成したリストは不変リストなので、結果を変更できないようにできる
//    teamId_100.add(list[2])
}

