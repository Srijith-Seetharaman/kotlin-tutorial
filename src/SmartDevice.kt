class SmartDevice {
    // empty body
    fun turnOn() {
        println("Smart Device is turned on.")
    }

    fun turnOff() {
        println("Smart Device is turned off.")
    }
}

fun main(){
    val smartTvDevice = SmartDevice()
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}