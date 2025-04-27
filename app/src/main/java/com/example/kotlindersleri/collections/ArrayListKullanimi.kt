package com.example.kotlindersleri.collections

fun main() {
    //Tanımlama
    val meyveler = ArrayList<String>()

    // Veri Ekleme : en sonuna ekleme yapar.
    meyveler.add("Elma") //0. eleman
    meyveler.add("Muz") //1. eleman
    meyveler.add("Kiraz") //2. eleman
    println(meyveler)

    // Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    // Insert : istediğimiz bir indekse ekleme
    meyveler.add(1 , "portakal")
    println(meyveler)

    // Okuma
    val m = meyveler.get(3)
    println(m)
    println(meyveler[3])

    println("Boyut : ${meyveler.size}")

    meyveler.reverse() //diziyi tgers çevirdik
    println(meyveler)

    for (meyve in  meyveler){
        println("Sonuc : $meyve")
    }

    for ((index,meyve) in  meyveler.withIndex()){ //Swift : enumarated()
        println("$index. -> : $meyve")
    }

    meyveler.removeAt(1)
    println(meyveler)

    meyveler.clear()
    println(meyveler)



}