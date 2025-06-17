package chap01

//mutable の復習(List)
fun main() {
    val intList: List<Int> = listOf<Int>(1, 2, 3)
    //intList.add(4)

    /*上記の場合、
    ・自動的にデータの方が判断され明記する必要は無い
    ・listOf と immutableListOf はイミュータブル(変更不可)なので
    　データの追加削除が出来ない
    ▼▼▼　下記なら大丈夫　▼▼▼
    */

    val intList2 = mutableListOf<Int>(1, 2, 3)
    intList2.add(4)

}