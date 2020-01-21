import java.awt.SystemColor.text

fun main() {
    val text = publishedAgo(1_400)
}

fun publishedAgo(sec: Int) {
    if (sec < 60) {
        println("Менее минуты назад")
    } else if (sec < 60 * 60) {
        val min = sec / 60
        println("$min минут назад")
    } else {
        val hour = sec / (60 * 60)
        if (hour == 1) {
            println("час назад")
        } else {
            println("несколько часов назад")
        }
    }
}
