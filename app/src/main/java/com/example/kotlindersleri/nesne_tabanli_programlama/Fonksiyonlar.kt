package com.example.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {
    //void - sadece işlem yapan
    fun selamla1() { //Swift de func olarak yazılır
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    //return - hem işlem yapan hem veri transferi yapan
    fun selamla2() : String {
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }

    //Parametre
    fun selamla3(isim: String) {
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //Overloading *
    //Bir sınıf içersinde aynı isimde fonksiyonları tekrar kullanmak
    fun topla(sayi1:Int , sayi2:Int){
     println("Toplama : ${sayi1+sayi2}")
    }

    fun topla(sayi1:Double, sayi2:Double){  //tür değişikliği
        println("Toplama : ${sayi1+sayi2}")
    }

    fun topla(sayi1:Int , sayi2:Int , isim: String){ //ekstra parametre
        println("Toplama : ${sayi1+sayi2} - Islem Yapan : $isim")
    }



}