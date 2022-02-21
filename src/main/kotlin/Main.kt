fun main() {
    val commissionPercentage = 0.075
    val minimumCommission = 3500L
    val transfertInKopecks = 100

    fun calcCommission(amount: Long): Long {
        val commission = (commissionPercentage * (amount*transfertInKopecks)).toLong()
        return if (commission > minimumCommission) commission else minimumCommission
    }

    println("Введите сумму перевода в руб.:")
    val totalCommission = readLine()?.let { calcCommission(it.toLong()) }
    println("Комиссия за перевод $totalCommission коп.")
}
