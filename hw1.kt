fun main() {
    val amount = 200 // стоимость текущей продажи
    val total = 9_900 // сумма предыдущих продаж
    val exclusive = true // флаг эксклюзивности
    val fee = calculateFee(200, 9_900, true)  // exclusive по умолчанию = false
    println(fee) // 40
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