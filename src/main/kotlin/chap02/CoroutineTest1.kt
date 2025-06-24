package chap02
//coroutine(delay)
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {  //launch coroutine ビルダの機能を持つ関数
    GlobalScope.launch {//----------- coroutine ----------------
        delay(1000L)  //delay 指定したミリ秒分待機する
        println("s24016")
    }//-------------------------- ここはあとから実行される ----------

    println("My name is")
    Thread.sleep(2000L)//sleep 指定したミリ秒分待機する

    /*
    【結果】
    My name is
    　数秒後に...
    s24016
    */
    //これは旧バージョンらしいので、新しい(?)やり方は CoroutineTest2 でやる
}