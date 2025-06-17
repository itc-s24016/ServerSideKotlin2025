package chap01

//interface(実装先)
/* 見分け方
chap01.Greeter() -> クラス
chap01.Greeter   -> インターフェース
*/
class GreeterImpl : Greeter{
    override fun hello() {
        print("Hello.")
    }
}