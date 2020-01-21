fun main() {
    val index = bodyMassIndex(1.57, 55.0)
    val verdict = when(index) {
        1 -> "Выраженный дефицит массы тела"
        2 -> "Недостаточная (дефицит) масса тела"
        3 -> "Норма"
        4 -> "Избыточная масса тела (предожирение)"
        5 -> "Ожирение"
        6 -> "Ожирение резкое"
        else -> "Очень резкое ожирение"
    }
    println(verdict)
}

fun bodyMassIndex(height: Double, weight: Double): Int {
    val index = weight / (height * height)
    if (index < 16) {
        return 1
    } else if (index < 18.5) {
        return 2
    } else if (index < 24.99) {
        return 3
    } else if (index < 30) {
        return 4
    } else if (index < 35) {
        return 5
    } else if (index < 40) {
        return 6
    } else {
        return 7
    }
}