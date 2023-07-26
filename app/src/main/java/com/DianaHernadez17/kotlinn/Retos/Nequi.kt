package com.DianaHernadez17.kotlinn.Retos

class Nequi {

}


fun main() {
    println("BIENVENIDO A NEQUI COLOMBIA :D")
    println("Si desea ingresar a nuestro sistema oprima 1")
    var ap: Int = readLine()!!.toInt()
    var saldo: Double = 4500.0

    while (ap == 1) {
        println(
            "Elige la opción que deseas: \n" +
                    "1. Consultar saldo \n" +
                    "2. Sacar dinero \n" +
                    "3. Enviar dinero \n" +
                    "4. Recargar \n" +
                    "5. Salir"
        )

        val opcion: Int = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                println("Tú saldo disponible es: $saldo")
            }

            2 -> {
                if (saldo < 2000) {
                    println("No te alcanza para hacer el retiro.")
                } else {
                    println("Ingresa la cantidad que deseas retirar:")
                    val retiro: Double = readLine()!!.toDouble()
                    if (retiro <= saldo) {
                        saldo -= retiro
                        val codigoRetiro = (100000..999999).random()
                        println("Retiro exitoso. Código de retiro: $codigoRetiro")
                        println("Tú saldo disponible ahora es: $saldo")
                    } else {
                        println("Saldo insuficiente para hacer el retiro.")
                    }
                }
            }

            3 -> {
                println("Ingresa el número de teléfono al que deseas enviar dinero:")
                val numeroTelefono: String = readLine()!!.toString()
                println("Ingresa el valor a enviar:")
                val valorEnviar: Double = readLine()!!.toDouble()

                if (valorEnviar <= saldo) {
                    saldo -= valorEnviar
                    println("Envío exitoso. Has enviado $valorEnviar a $numeroTelefono")
                    println("Tú saldo disponible ahora es: $saldo")
                } else {
                    println("Saldo insuficiente para enviar el dinero.")
                }
            }

            4 -> {
                println("Ingresa el valor a recargar:")
                val recarga: Double = readLine()!!.toDouble()
                println("¿Estás seguro que deseas realizar la recarga? (Si/No)")
                val confirmacion: String = readLine()!!.toString()

                if (confirmacion.equals("Si", ignoreCase = true)) {
                    saldo += recarga
                    println("Recarga exitosa. Tú saldo disponible ahora es: $saldo")
                } else {
                    println("Recarga cancelada.")
                }
            }

            5 -> {
                println("Gracias por usar Nequi Colombia, HASTA PRONTO :D")
                ap = 0
            }

            else -> {
                println("Opción inválida. Por favor, elige una opción válida.")
            }
        }
    }
}