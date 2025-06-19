package chap02
//スコープ関数まとめ
fun main() {
    withTest() // 1 3 5 7 9
    runTest()
    letTest()

    val user: User100 = User100("Unknown")
    println(createUser(null)?.name)

    applyTest()
    updateUser(1, "New Name", "Tokyo")

    alsoTest()

    badUpdateUser(3, "New Name", "Tokyo")

    val cls = ScopeClass(100)
    cls.updateUser(1000, "New Name", "Okinawa")
    //User200(id=1000, name=New Name(1000:1000), address=Okinawa)にならないために
}

fun withTest() {
    //-- with を使用しないパターン -------------------------------
    println("\n▼ defaultTest ▼")
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
    //既に存在するオブジェクトに対して複数の操作を連続して行いたいとき
    println("\n▼ withTest ▼")
    val oddNumbers2 = with(mutableListOf<Int>()){
        for (i in 1..10){
            if (i % 2 == 1){ add(i) }//this.add(i) を省略中
        }
        joinToString(separator = " ")//this.join.. を省略中 & 戻り値になる
    }
    println(oddNumbers2)
    //-----------------------------------------------------------------
}

fun runTest() {
    //レシーバの拡張関数として実装するパターン
    //with同様、既存のオブジェクトに対して行うが nullの安全性を確保したい時
    println("\n▼ runTest ▼")
    val oddNumbers = mutableSetOf<Int>().run{
        for (i in 1..10){
            if (i % 2 == 1){ add(i) }
        }
        joinToString(separator = " ")
    }
    println(oddNumbers)
}

//run の有効活用法(null に強い)
fun getUserString(user: User1?, newName: String): String? {
    return user?.run {
        name = newName
        toString()
    }
}

fun letTest() {
    println("\n▼ letTest ▼")
    val oddNumbers = mutableSetOf<Int>().let{
        list ->
        for (i in 1..10){
            if (i % 2 == 1){ list.add(i) }
        }
        list.joinToString(separator = " ")
    }
    println(oddNumbers)
}
//なぜletが使われるのか
//null に強い
data class User100(val name: String)
fun createUser(name: String?): User100? {
    return name?.let(::User100)
}

fun applyTest(){
    println("\n▼ applyTest ▼")
    val oddNumbers = mutableSetOf<Int>().apply {
        for (i in 1..10){
            if (i % 2 == 1){ add(i) }
        }
        joinToString(separator = " ")
    }
    println(oddNumbers)
}

data class User200(val id: Int, var name: String, var address: String)
fun getUser(id: Int): User200 {
    return User200(id = id, name = "Unknown", address = "Okinawa")
}
fun updateUser(id: Int, newName: String, newAddress: String) {
    val user = getUser(id).apply {
        name = newName
        address = newAddress
    //run の場合、ラムダ式の最後の列がreturnになるので、
    // 戻り値はUnit = val user に unit が渡されてしまう
    }
    println(user)
}

fun alsoTest(){
    //apply と let をあわせたようなもの
    println("\n▼ alsoTest ▼")
    val user = getUser(2).also {
        it.name = "Name Also"
        it.address = "Address Also"
    }
    println(user)
}

fun badUpdateUser(id: Int, newName: String, newAddress: String){
    var name = ""
    val user = getUser(id).apply {
        name = newName
        address = newAddress
    }
    println("▼ badUpdateuser ▼")
    println(user)
}

class ScopeClass(val id: Int){
    fun updateUser(id: Int, newName: String, newAddress: String){
        println("\n▼ ScopeClass ▼")
        println("this.id: ${id}")
        val user = getUser(id).apply {
            //val cls = ScopeClass(100) <- このid = 100を表示させたい
            name = "${newName}(${id}:${this@ScopeClass.id})"
            address = newAddress
        }
        println(user)
    }
}