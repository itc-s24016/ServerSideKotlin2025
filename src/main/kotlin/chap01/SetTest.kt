package chap01

//mutable の復習(Map)
fun main() {
    val set = setOf(1, 2, 3)

    //set はこの使い方が高速なことで有名
    println(3 in set)//set に 3 は含まれていますか？
    println(4 in set)//set に 4 は含まれていますか？

    val mutableSet = mutableSetOf(1, 2, 3)
    mutableSet.add(3)
    mutableSet.add(3)
    mutableSet.add(3)
    println(mutableSet)
    /*
    set はデータの重複を許さないので、
    [1, 2, 3, 3, 3, 3]ではなく、
    [1, 2, 3]      となる
    */
}