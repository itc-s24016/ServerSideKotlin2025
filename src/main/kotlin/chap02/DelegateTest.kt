package chap02
import kotlin.reflect.KProperty
//デリゲート
fun main() {
    println("↓ delegete ↓")//クラスの移譲
    val exeDelegate = AddCalcExeDelegate(CommonCalcExe())
    exeDelegate.printMsg()
    println(exeDelegate.calc(8, 11))

    println("\n↓ Person ↓")
    val person = Person()
    person.name = "Unknow"
    person.address = "Okinawa"

    println("\n↓ Person2 ↓")
    val person2 = Person2()
    person2.name = "Unknow"
    person2.address = "Okinawa"

}

interface CalcExe{
    val msg: String
    fun calc(num1: Int, num2: Int): Int
    fun printMsg()
}

class CommonCalcExe(override val msg: String = "calc")
    : CalcExe{
    override fun calc(num1: Int, num2: Int): Int{
        throw IllegalStateException("不正な状態なため、実装出来ません")
    }

    override fun printMsg() {
        println("実行: ${msg}")
    }
}

//足し算をする　by <- デリゲートポイント
class AddCalcExeDelegate(val calcExe: CalcExe)
    : CalcExe by calcExe{

    override fun calc(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

//通常のPersonクラス-------------------------------
class Person {
    var name: String = ""
        get() {
            println("name を取得します")
            return field
        }
        set(value){
            println("name を更新します")
            field = value
        }
    var address: String = ""
        get(){
            println("address を取得します")
            return field
        }
        set(value){
            println("address を更新します")
            field = value
        }
}
//------------------------------------------


//セッターゲッターの部分を移譲した（デリゲート）パターン------------------------------
class DelegateWithMsg<T>{
    //他のクラス(T)の name
// 等のプロパティ名を取得する
    private var value: T? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        println("${property.name}を取得します")
        return value!!
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        println("${property.name}を更新中")
        this.value = value
        println("${property.name} を更新しました")
    }
}
class Person2{
    var name: String by DelegateWithMsg()
    var address: String by DelegateWithMsg()
}
//-------------------------------------------------------------------------
