package org.example

fun main() {
    fun sumarPares(numeros: Array<Int>): Int {
        return numeros.filter { it % 2 == 0 }.sum()
    }
    val numeros = arrayOf(1, 2, 3, 4, 5, 6)
    println(sumarPares(numeros))

}