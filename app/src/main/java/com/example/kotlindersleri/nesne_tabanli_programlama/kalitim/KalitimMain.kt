package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar() //kalıtım yok ,kendi metodunu erişti
    memeli.sesCikar() //kalıtım var, memelide ses cıkar fonksiyonuu yok , bir üst sınıfın metoduna erişti
    kedi.sesCikar()   //kalıtım var , kendi fonksiyonuna erişti
    kopek.sesCikar()  //kalıtım var , kendi metoduna erişti
}