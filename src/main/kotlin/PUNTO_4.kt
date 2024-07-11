package org.example

fun main() {
    fun aplicarOperacion(numero: Int, operacion: (Int) -> Int): Int {
        return operacion(numero)
    }
    fun cuadrado(numero: Int): Int {
        return numero * numero
    }

    println(aplicarOperacion(5, ::cuadrado))

}