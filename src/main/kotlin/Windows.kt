//パッケージ名を xx.platforms -> xx.pc に変更してみた
//結果：シールドクラスを継承出来ないよって言われる
//package jp.ac.it_college.std.s24016.kotlin.pc
package jp.ac.it_college.std.s24016.kotlin.platforms
//sealed
class Windows: Platform() {
    override fun showName() {
        println("Windows")
    }
}