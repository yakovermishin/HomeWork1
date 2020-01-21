fun main() {
    val fee = calculateFee(200, 9_900, true)
    println(fee)

    val fee2 = calculateFee(100, 5_700, true)
    println(fee2)

    val fee3 = calculateFee(7_000, 9_900, true)
    println(fee3)
}

fun calculateFee(amount: Int, total: Int, exclusive: Boolean): String {
    val newTotal = amount + total
    var discount = 0
    if (newTotal in 0..1000) {
        discount = 30
    } else if (newTotal in 1001..10_000) {
        discount = 25
    } else if (newTotal in 10_001..50_000) {
        discount = 20
    } else {
        discount = 15
    }
    if (exclusive) {
        discount -= 5
    }
    return "Ваща скидка - $discount%"
}