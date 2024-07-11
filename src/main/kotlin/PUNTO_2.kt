package org.example

fun main() {
    class Producto(val nombre: String, val precio: Double) {
        fun mostrarPrecioConIVA() {
            val precioConIVA = precio * 1.16
            println("Precio con IVA: $precioConIVA")
        }
    }
    val laptop = Producto("Laptop X", 1500.0)
    laptop.mostrarPrecioConIVA()

}