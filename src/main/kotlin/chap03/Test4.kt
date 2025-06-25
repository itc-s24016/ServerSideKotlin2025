package chap03
//java と Kotlin の相互作用
fun main() {
    val constants1 = CompanyConstants()
    println("最大従業員数：${constants1.maxEmployeeCount}")
    printMacEmployeeCount(constants1)

    val constants2 = CompanyConstants()
    val constants3 = CompanyConstants()
}
fun printMacEmployeeCount(cousntants: CompanyConstants){
    println(cousntants.maxEmployeeCount)
}

class CompanyConstants {
    val maxEmployeeCount = 100 //最大従業員数
}