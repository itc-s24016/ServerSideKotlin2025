package chap02
//with
//スコープ関数の一種
fun main() {
    withTest() // 1 3 5 7 9
}

fun withTest() {
    //-- with を使用しないパターン -------------------------------
    val list = mutableListOf<Int>()
    for (i in 1..10){
        if (i % 2 == 1){ list.add(i) }
    }
    val oddNumbers1 = list.joinToString(separator = " ")
    println(oddNumbers1)
    /*　　【内容】
    ・空のミュータブルリストを用意
    ・10までの奇数をリストに入れる
    ・空白区切りでリストを表示    */
    //---------------------------------------------------------

    //-- with を使用したパターン ----------------------------------------
    val oddNumbers2 = with(mutableListOf<Int>()){
        for (i in 1..10){
            if (i % 2 == 1){ add(i) }//this.add(i) を省略中
        }
        joinToString(separator = " ")//this.join.. を省略中 & 戻り値になる
    }
    println(oddNumbers2)
    //-----------------------------------------------------------------
}