package chap02
//coroutine(runBlocking)
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
【runBlocking】
このスコープ内で coroutine の実行があった場合、
全ての coroutine の処理が終わるまで待機する
*/
/*   //Test1 と同じ結果になる
fun main() = runBlocking {
    launch {
        delay(2000L)
        println("s24016")
    }
    println("My name is")
}*/

fun main() = runBlocking {
    launch {
        printName()
    }
    println("My name is")
}
suspend fun printName(){//---- suspend function -----
    delay(2000L)//delay : coroutine の中 or 別サスペンドファンクションで行う
    println("s24016")
}//--------------------------------------------------