package chap01

//mutable の復習(Map)
fun main() {
    val map: Map<Int, String> = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )
    //map[4] = "four"
    println(map)

    val mutableMap = mutableMapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )
    mutableMap[4] = "four"
    println(mutableMap)
}