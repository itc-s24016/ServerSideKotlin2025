package chap02_10
//distinct
fun main() {
    val list = listOf(1, 1, 2, 3, 4, 4, 5)

    //set リストのように、重複をなくしてくれる
    val distinctList = list.distinct()
    distinctList.forEach { println(it) }
}