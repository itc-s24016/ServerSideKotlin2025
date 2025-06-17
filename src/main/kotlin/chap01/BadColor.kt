package jp.ac.it_college.std.s24016.kotlin
//リストと列挙型でデータを扱うときの違い(リスト)
import kotlin.random.Random

fun main() {
    val colors =
        listOf(
            "red",
            "green",
            "blue",
            "yellow"
        )
    //リストからランダムに取得
    val randomSelect = Random.nextInt(colors.size)

    println(when(colors[randomSelect]) {
            "red" -> "赤が選択されました"
            "green" -> "青が選択されました"
            "blue" -> "緑が選択されました"
            else -> "不明な色が選択されました" //ここを消すとエラーになる
        })
    //リストは必ず else をつけないといけない
}