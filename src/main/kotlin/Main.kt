fun main() {
    val commissionPercentage = 0.075
    val minimumCommission = 35L
    val transfertInKopecks = 10

    fun calcCommission(amount: Long): Long {
        val commission = (commissionPercentage * amount).toLong()
        return if (commission > minimumCommission) commission * transfertInKopecks else minimumCommission * transfertInKopecks
    }

    println("Введите сумму перевода в руб.:")
    val totalCommission = readLine()?.let { calcCommission(it.toLong()) }
    println("Комиссия за перевод $totalCommission коп.")
}
