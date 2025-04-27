package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f = Fonksiyonlar()

    //void = Unit
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2()
    println("GelenSonuc : $gelenSonuc")

    //parametre
    f.selamla3("Zeynep")

    f.topla(10 , 20 , "Beyza")
    
}
