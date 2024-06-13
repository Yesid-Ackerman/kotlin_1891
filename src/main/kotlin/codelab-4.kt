class pepe {

    val name = "Clase PEPE"
    val category = "Hola desde categoria"
    val deviceStatus = "Hola desde Status"


    /*
    fun turnOn() {
        println("Hola desde TurnOn")
    }

    fun turnOff() {
        println("Hola desde TurnOff")
    }
     */
    /*
    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

     */
    class miniclase (name: String,category: String):
            pepe(name=name,category=category){

            }
}
fun main() {
    //smartTvDevice.turnOn()
    //smartTvDevice.turnOff()


    val funyes = pepe()
    println("Hola desde Main con la ${funyes.name}")


}
class bob constructor( val name: String, val category: String) {
    var deviceStatus = "Hola de nuevo desde el constructor"
    /*
    fun turnOn() {
        println("Hola desde TurnOn")
    }

    fun turnOff() {
        println("Hola desde TurnOff")
    }
    */
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

}