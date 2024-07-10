fun main() {
    val phone = FoldablePhone()
    phone.open()
    phone.turnOn()
    phone.checkPhoneScreenLight()
    phone.close()
    phone.turnOn()
    phone.checkPhoneScreenLight()
}

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun turnOn() {
        isScreenLightOn = true
    }

    fun turnOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone : Phone() {
    private var isFolded = true

    fun open() {
        isFolded = false
    }

    fun close() {
        isFolded = true
    }

    override fun turnOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }
}
