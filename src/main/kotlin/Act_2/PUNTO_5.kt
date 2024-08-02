package org.example

fun main() {
    abstract class FiguGeo {
        abstract fun Area(): Double
    }

    class Rectangulo(val ancho: Double, val alto: Double) : FiguGeo() {
        override fun Area(): Double {
            return ancho * alto
        }
    }

    class Circulo(val radio: Double) : FiguGeo() {
        override fun Area(): Double {
            return Math.PI * radio * radio
        }
    }

    val rectangulo = Rectangulo(4.0, 5.0)
    println("Área del rectángulo: ${rectangulo.Area()}")

    val circulo = Circulo(3.0)
    println("Área del círculo: ${circulo.Area()}")

}