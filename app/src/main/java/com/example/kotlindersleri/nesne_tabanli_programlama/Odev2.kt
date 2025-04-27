package com.example.kotlindersleri.nesne_tabanli_programlama

class Odev2 {


    // Kenar sayısına göre iç açıları hesaplayan metot
    fun calculateInteriorAngles(sides: Int): Int {
        return (sides - 2) * 180
    }

    // Gün sayısına göre maaşı hesaplayan metot
    fun calculateSalary(days: Int): Int {
        val totalHours = days * 8

        return if (totalHours <= 160) {
            totalHours * 10
        } else {
            val regularPay = 160 * 10
            val overtimePay = (totalHours - 160) * 20
            regularPay + overtimePay
        }
    }

    // Kota miktarına göre internet ücreti hesaplayan metot
    fun calculateInternetBill(dataUsage: Int): Int {
        return if (dataUsage <= 50) {
            100
        } else {
            val extraData = dataUsage - 50
            100 + (extraData * 4)
        }
    }
}

// Ana fonksiyon burada (class dışı)
fun main() {
    val calc = Odev2()

    // İç açıları hesaplama
    println(calc.calculateInteriorAngles(5))    // Çıktı: 540

    // Maaş hesaplama
    println(calc.calculateSalary(20))            // Çıktı: 1600
    println(calc.calculateSalary(25))            // Çıktı: 2000

    // İnternet ücreti hesaplama
    println(calc.calculateInternetBill(45))      // Çıktı: 100
    println(calc.calculateInternetBill(55))
}