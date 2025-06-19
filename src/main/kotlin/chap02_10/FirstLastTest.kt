package chap02_10
//first, last
fun main() {
    val list = listOf(
        User(1, 100, "Kotlin"),
        User(2, 100, "Java"),
        User(3, 100, "Scala"),
        User(4, 200, "Swift"),
        User(5, 300, "C++"),
    )
    println("first: ${list.first()}") //リストの先頭の要素
    println("last: ${list.last()}")   //リストの末尾の要素
    //先頭、末尾を取得するだけじゃない！

    //条件に合う要素から探すことも可能！
    //Kotlin, Java, Scala が該当者
    println("teamId=100 is first [ ${list.first {it.teamId == 100}.name} ]")
    println("teamId=100 is  last [ ${list.last  {it.teamId == 100}.name} ]")

    //例外を起こしてみる
//    println(list.first {it.teamId == 1000}.name)
    //NoSuchElementException というエラーが返ってくるので、
    //「.firstOrNull」で該当するデータが無い場合は null で返すようにする
    println(list.firstOrNull {it.teamId == 1000}?.name)
}