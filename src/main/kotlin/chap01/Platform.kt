package jp.ac.it_college.std.s24016.kotlin.platforms
//sealed
sealed class Platform {
    abstract fun showName()
}

class Android: Platform() {
    override fun showName() {
        println("Android")
    }
}