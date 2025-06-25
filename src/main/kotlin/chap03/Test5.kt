package chap03
//java と Kotlin の相互作用
fun main() {
    val company1 = CompanyInfo()
    val company2 = CompanyInfo()
    company1.join(20)
    company2.join(5)
    println("企業1")
    company1.printCurrentEmployee()
    println("企業2")
    company2.printCurrentEmployee()
    println("各企業の最大従業員数: ${CompanyInfo.MAX_EMPLOYEE_COUNT}")
    CompanyInfo.printMaxEmployeeCount()
}

class CompanyInfo {
    companion object {
        const val MAX_EMPLOYEE_COUNT = 100

        @JvmStatic
        fun printMaxEmployeeCount() {
            println(MAX_EMPLOYEE_COUNT)
        }
    }

    var currentEmployeeCount = 0
        private set

    fun printCurrentEmployee() {
        println("現在の従業員数: $currentEmployeeCount")
    }

    fun join(num: Int) {
        if (currentEmployeeCount + num < MAX_EMPLOYEE_COUNT) {
            currentEmployeeCount += num
        } else {
            println("最大従業員数を超えます")
        }
    }

    fun leave(num: Int) {
        currentEmployeeCount -= num
        if (currentEmployeeCount < 0) {
            currentEmployeeCount = 0
        }
    }
}