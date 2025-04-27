package com.example.kotlindersleri.collections

fun main() {
    val f1 = Filmler(1 , "Babam Oğlum" , 50)
    val f2 = Filmler(2 , "Neşeli Hayatlar" , 30)
    val f3 = Filmler(3 , "Kış Uykusu" , 80)

    val filmlerlistesi = ArrayList<Filmler>()
    filmlerlistesi.add(f1)
    filmlerlistesi.add(f2)
    filmlerlistesi.add(f3)

    for (film in filmlerlistesi){
        println("${film.id} : ${film.ad}  ${film.fiyat} TL")
    }

    //Sıralama - Sorting
    println("-----Artan Sıralama-----")
    // Ascend-ASC
    val sıralama1 = filmlerlistesi.sortedWith(compareBy{ it.fiyat }) //it.ad -> ada göre sıralama
    for (film in sıralama1){
        println("${film.id} : ${film.ad}  ${film.fiyat} TL")
    }

    println("-----Azalan Sıralama-----")
    // Ascend-ASC
    val sıralama2 = filmlerlistesi.sortedWith(compareByDescending{ it.fiyat })
    for (film in sıralama2){
        println("${film.id} : ${film.ad}  ${film.fiyat} TL")
    }

    //Filtreleme
    println("------ Filtreleme 1 ------")
    val filtreleme1 = filmlerlistesi.filter { it.fiyat > 40 && it.fiyat < 60}
    for (film in filtreleme1){
        println("${film.id} : ${film.ad}  ${film.fiyat} TL")
    }

    println("------ Filtreleme 2 ------")
    val filtreleme2 = filmlerlistesi.filter { it.ad.contains("at")}
    for (film in filtreleme2){
        println("${film.id} : ${film.ad}  ${film.fiyat} TL")
    }







}