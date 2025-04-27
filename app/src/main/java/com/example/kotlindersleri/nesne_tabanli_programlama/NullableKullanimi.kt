package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    // Nullable , Null Safety;Optional(Swift)
    //Genellikle mobil uygulama geliştirme dillerinde yer almaktadır.
    //null,NaN,nil
    // 1.Tanımlama
    var mesaj:String?= null

    mesaj = "Merhaba"

    // Yöntem1
    // Sorun yoksa çalışır , sorun varsa uygulama çökmez
    println("Yontem 1 : ${mesaj?.uppercase()}")

    val x = mesaj?.uppercase()

    // Yöntem 2
    // Sorun yoksa çalışır , sorun varsa uygulama çöker
    // Çok emin olduğumuz koldarda kullanabiliriz
     println("Yontem 2 : ${mesaj!!.uppercase()}")

    // Yöntem 3
    // null kontrol
    if (mesaj != null){
        println("Yontem 3 : ${mesaj.uppercase()}")
    } else {
        println("Degiskende null yer almaktadir")
    }

    //null kontrol
    mesaj?.let {
        println("Yontem 3 : ${mesaj.uppercase()}")
    }



}