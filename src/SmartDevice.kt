class SmartDevice {

    private var deviceName = "Smart Television"
    private var deviceCategory = "Entertainment"
    private var deviceStatus = "online"

    // empty body
    fun turnOn() {
        println("$deviceName is turned on.")
    }

    fun turnOff() {
        println("$deviceName is turned off.")
    }

    fun printName() {
        println("Device name is: $deviceName")
    }

    fun setDeviceName(deviceName: String) {
        this.deviceName = deviceName
    }

    fun getDeviceName(): String {
        return this.deviceName
    }
}

fun main() {
    val smartTvDevice = SmartDevice()
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
    smartTvDevice.printName()
    smartTvDevice.setDeviceName("Smart Refrigerator")
    smartTvDevice.printName()
    println("Device Name: ${smartTvDevice.getDeviceName()}")
}