package com.DianaHernadez17.kotlinn.Ejercicios

class Arrays {
}

fun main() {

    val pets = arrayOf("Dog", "Cat", "Canary")
    //Cambiar el elemento de una posición en particular

    pets[2] = "Parrot"

    println(pets.contentToString())
    //Imprimir el elemento de una posición del array
    println(pets[1])

    for ((index, element) in pets.withIndex()) {
        println("La mascota No. $index es $element")
    }

    // val instruments = listOf("Trumpet","saxofon","violin")
    //println(instruments)


    val instrumentos: List<String> = listOf("Trumpet", "piano", "violin")


    val instruments = mutableListOf("Trumpet", "saxofon", "violin")
    println(instruments)


    // 1. Como obtener el primero y último elemento de una lista


    //Imprimer una lista completa de todos los elementos del array

    var numbers = listOf(1, 2, 3, 4, 5, 6)
    println("List: $numbers")

    //Imprime el primer elemento de un a lista
    println("First: ${numbers.first()}")


    //Imprime el último elemento de una lista
    println("Size: ${numbers.size}")


    // 2. Cómo agregar elementos a una lista mutable, Utilizamos la funcion add

    val number: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    number.add(8)
    println(number)

    //3. Cómo quitar elementos de una lista mutable

    val number1: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    number1.remove(6)
    println(number1)

    //4. Quitar un elemento que no existe
    // Queda de la misma manera



    //5. Como quitar elementos de una lista atraves del index

    val number2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    number2.removeAt(6)
    println(number2)


    //6. Cómo borrar una lista completa

    val number3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    number3.clear()
    println(number3)






}