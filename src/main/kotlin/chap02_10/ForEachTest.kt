package chap02_10
//forEach の復習
fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

//    forEach : リストの中身一つずつに同一の処理を行う
    list.forEach { println(it) }
//    list.forEach { num -> println(num) } 同じ動作をする
}