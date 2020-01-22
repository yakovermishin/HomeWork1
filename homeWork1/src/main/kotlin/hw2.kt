fun main() {
    val index = bodyMassIndex(1.57, 55.0)
    println(index)

    val index2 = bodyMassIndex(1.87, 85.0)
    println(index2)

    val index3 = bodyMassIndex(1.96, 125.0)
    println(index3)
}

fun bodyMassIndex(height: Double, weight: Double): String {
    /*
    val index = weight / (height * height)
    val verdict
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
     */
    val index = weight / (height * height)
    val verdict = when(index) {
        in 1.0..16.0 -> "Выраженный дефицит массы тела"
        in 16.0..18.5 -> "Недостаточная (дефицит) масса тела"
        in 18.5..24.99 -> "Норма"
        in 24.99..30.0 -> "Избыточная масса тела (предожирение)"
        in 30.0..35.0 -> "Ожирение"
        in 35.0..40.0 -> "Ожирение резкое"
        else -> "Очень резкое ожирение"
    }
    return verdict
}