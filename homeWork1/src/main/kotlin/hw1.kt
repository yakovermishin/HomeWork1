fun main() {
    val fee = calculateFee(200, 900, false)
    println("Ваша комиссия составит: $fee%")

    val fee2 = calculateFee(100, 5_700, true)
    println("Ваша комиссия составит: $fee2%")

    val fee3 = calculateFee(7_000, 89_900, true)
    println("Ваша комиссия составит: $fee3%")
}

fun calculateFee(amount: Int, total: Int, exclusive: Boolean): Int {
    /*
    var discount = 0

    if (total in 0..1000) {
        discount = 30
    } else if (total in 1001..10_000) {
        discount = 25
    } else if (total in 10_001..50_000) {
        discount = 20
    } else {
        discount = 15
    }
    if (exclusive) {
        discount -= 5
    }
     */
    var discount = when(total) {
        in 0..1_000 -> 30
        in 1_001..10_000 -> 25
        in 10_001..50_000 -> 20
        else -> 15
    }
    if (exclusive) {
        discount -= 5
    }
    return discount
}