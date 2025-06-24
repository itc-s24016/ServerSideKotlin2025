package chap03
//UUID, LocalDateTime
import java.time.LocalDateTime
import java.util.UUID

fun main() {
    val uuid: UUID = UUID.randomUUID()
    println(uuid.toString())

    val now = Time(LocalDateTime.now())
    println(now.toString())
}
data class Time(val time: LocalDateTime)