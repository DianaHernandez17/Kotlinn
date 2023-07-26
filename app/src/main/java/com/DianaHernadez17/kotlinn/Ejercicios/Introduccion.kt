package com.DianaHernadez17.kotlinn.Ejercicios



class Introduccion {
}

fun main() {

    /* var name: String="Alejandra"
     val tipo1: Long=132
     var hola: Int = 45
     val tipo3: Short=145
     val tipo4: Byte=57
     var tipo5: Double=1.555
     val tipo6: Float = 65.00f


     var num41: Int=500
     var num24: Int=235

     println("El resultado es${num41 + num24}")

     print(tipo1)



     val s = "Jennifer"
     println("$s.length is ${s.length}")*/


    println("Ingrese el número")
    var num1: Int= readLine()!!.toInt()


    println("Ingrese el segundo  número")
    var num2: Int= readLine()!!.toInt()



    val suma: Int= num1.plus(num2)
    println("La suma es $suma")




}