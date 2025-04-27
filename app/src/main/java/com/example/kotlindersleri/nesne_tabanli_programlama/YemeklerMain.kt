package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nesne oluşuturma
    val y1 = Yemekler(100 , "Köfte" , 249)
    // değer okuma
    y1.bilgiAl()
    //değer atama/değiştirme
    y1.fiyat = 350
    y1.bilgiAl()

    val y2 = Yemekler(200 , "Baklava" , 300)
    y2.bilgiAl()
    y2.ad = "Soğuk Baklava"
    y2.bilgiAl()




}