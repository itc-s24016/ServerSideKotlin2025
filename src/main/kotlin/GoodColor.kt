package jp.ac.it_college.std.s24016.kotlin
//リストと列挙型でデータを扱うときの違い(列挙)
import kotlin.random.Random

// 列挙型
// コンパイル時に予め要素の内容と個数が決定できる。
enum class Color(val colorCode: String) {
    Red("#FF0000"),
    Green("#00FF00"),
    Blue("#0000FF"),
    Yellow("#FFFF00"),
}

fun main() {
    // ランダムで色を選択
    val selectedColor = Color.entries[Random.nextInt(Color.entries.size)]

    val message = when (selectedColor) {
        Color.Red -> "赤が選択されました"
        Color.Green -> "緑が選択されました"
        Color.Blue -> "青が選択されました"
        Color.Yellow -> "黃が選択されました"
    }
    println("$message : ${selectedColor.colorCode}")
    val defaultColor = Color.Red
    println("デフォルト : ${defaultColor.colorCode}")

}