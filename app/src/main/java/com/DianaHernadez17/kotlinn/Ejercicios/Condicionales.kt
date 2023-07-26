package com.DianaHernadez17.kotlinn.Ejercicios


class Condicionales {

}

fun main() {

    /*println("Ingrese el número 1:")
    var num1:Int= readLine()!!.toInt()

    println("Ingrese el número 2:")
    var num2:Int= readLine()!!.toInt()

    if (num1>num2){
        //In Strucciones si condición se cumple
        print("El número ${num1}: es el mayor ")

    }else if (num1 ==num2){
        //In Strucciones si condiición No se cumple
        print("Los números son iiguales ")
    }else {
        //In Strucciones si condiición No se cumple
        print("El número es: ${num1}: es el  menor")
    }


*/

    println("Ingrese un número del 1 al 20 :")

    var number:Int= readLine()!!.toInt()


    if(number in 1..20){
        println("El número esta en el rango")
    }else{
        println("El número esta fuera del rango")

    }

    var results : Int= (1..20).random()
    println("el numero random es: $results")

    when(results){
        0 -> println("No hay resultados")
        1,2,3,4,5-> println("Hay menos de 5 resultados")
        in 6 .. 50 -> println("Hay entre 5 y 50 resultados")
        else -> println("Esos son bastantes resultados")
    }

}