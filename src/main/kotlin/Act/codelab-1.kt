fun main() {
    //val greeting = birthday()
    // println(greeting)
    println(birthday("Kotlin Uniti", ag = 1721))
}

fun birthday(nam: String, ag: Int): String {
    return "Hola desde $nam, y Hola desde $ag"
}