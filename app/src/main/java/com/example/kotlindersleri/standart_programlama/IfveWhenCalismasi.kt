package com.example.kotlindersleri.standart_programlama

fun main() {

    val yas = 19

    if(yas >= 18) {
    println("Resitsiniz")
    } else {
        println("resit degilsiniz")
    }


    val ka = "admin"
    val s = 1234567
    val sayi = 8

    if(ka == "admin" && s == 123456){
        println("Hosgeldiniz")
    }else{
        println("Hatali Giris")
    }

    if(sayi == 9 || sayi == 10){
    println("sayi 9 veya 10dur")
    }else{
        println("sayi 9 veya 10 degildir")
    }

    //when : Diğer dillerde switch
    val number = 8

    when(number){
        1 -> {
            println("sayi 1 dir")
        }
        2 -> println("sayi 2 dir")
        else -> println("tanimlanmayan sayi")
    }






















}