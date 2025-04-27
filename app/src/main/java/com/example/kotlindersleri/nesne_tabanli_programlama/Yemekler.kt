package com.example.kotlindersleri.nesne_tabanli_programlama

data class Yemekler(var id:Int , var ad:String , var fiyat:Int) {
    //Constructor - init fonksiyonu
    //Bu sınıftan nesne oluştuğunda çalışsın
    init {
        println("******** Nesne olustu ********")
    }

    fun bilgiAl(){
        println("------------")
        println("Id : ${id}")
        println("Ad : ${ad}")
        println("Fiyat : ${fiyat}")
    }
    //this : bulunduğu sınıfı temsil eder. Swift de this değil self kullanılır
    //super : kalıtım ile bi üst sınıfı temsiil eder





}
