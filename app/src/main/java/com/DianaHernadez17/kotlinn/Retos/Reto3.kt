package com.DianaHernadez17.kotlinn.Retos


data class Carro(val marca: String, val modelo: String, val año: Int)
class Reto3 {

}

fun main() {
    val listaCarros = mutableListOf<Carro>()

    while (true) {
        mostrarMenu()
        val opcion = readLine()

        when (opcion) {
            "1" -> insertarCarro(listaCarros)
            "2" -> mostrarCarros(listaCarros)
            "3" -> buscarCarro(listaCarros)
            "4" -> modificarCarro(listaCarros)
            "5" -> eliminarCarro(listaCarros)
            "6" -> {
                println("¡Hasta luego!")
                return
            }
            else -> println("Opción inválida. Por favor, ingresa un número válido.")
        }
    }
}

fun mostrarMenu() {
    println("------- MENÚ DE OPCIONES -------")
    println("1. Insertar un nuevo carro")
    println("2. Mostrar todos los carros")
    println("3. Buscar un carro")
    println("4. Modificar un carro")
    println("5. Eliminar un carro")
    println("6. Salir")
}

fun insertarCarro(listaCarros: MutableList<Carro>) {
    println("Ingrese la marca del carro:")
    val marca = readLine() ?: return

    println("Ingrese el modelo del carro:")
    val modelo = readLine() ?: return

    println("Ingrese el año del carro:")
    val año = readLine()?.toIntOrNull() ?: return

    listaCarros.add(Carro(marca, modelo, año))
    println("Carro agregado exitosamente.")
}

fun mostrarCarros(listaCarros: List<Carro>) {
    if (listaCarros.isEmpty()) {
        println("No hay carros en la lista.")
        return
    }

    println("------- LISTA DE CARROS -------")
    for ((index, carro) in listaCarros.withIndex()) {
        println("${index + 1}. Marca: ${carro.marca}, Modelo: ${carro.modelo}, Año: ${carro.año}")
    }
}

fun buscarCarro(listaCarros: List<Carro>) {
    if (listaCarros.isEmpty()) {
        println("No hay carros en la lista.")
        return
    }

    println("Ingrese el índice del carro que desea buscar:")
    val index = readLine()?.toIntOrNull() ?: return

    if (index in 1..listaCarros.size) {
        val carro = listaCarros[index - 1]
        println("Información del carro:")
        println("Marca: ${carro.marca}, Modelo: ${carro.modelo}, Año: ${carro.año}")
    } else {
        println("Índice inválido.")
    }
}

fun modificarCarro(listaCarros: MutableList<Carro>) {
    if (listaCarros.isEmpty()) {
        println("No hay carros en la lista.")
        return
    }

    println("Ingrese el índice del carro que desea modificar:")
    val index = readLine()?.toIntOrNull() ?: return

    if (index in 1..listaCarros.size) {
        println("Ingrese la nueva marca del carro:")
        val marca = readLine() ?: return

        println("Ingrese el nuevo modelo del carro:")
        val modelo = readLine() ?: return

        println("Ingrese el nuevo año del carro:")
        val año = readLine()?.toIntOrNull() ?: return

        listaCarros[index - 1] = Carro(marca, modelo, año)
        println("Carro modificado exitosamente.")
    } else {
        println("Índice inválido.")
    }
}

fun eliminarCarro(listaCarros: MutableList<Carro>) {
    if (listaCarros.isEmpty()) {
        println("No hay carros en la lista.")
        return
    }

    println("Ingrese el índice del carro que desea eliminar:")
    val index = readLine()?.toIntOrNull() ?: return

    if (index in 1..listaCarros.size) {
        listaCarros.removeAt(index - 1)
        println("Carro eliminado exitosamente.")
    } else {
        println("Índice inválido.")
    }
}
