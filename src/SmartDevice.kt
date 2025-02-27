open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "Offline"

    constructor(name: String, category: String, statusCode: Int) : this(name = name, category = category) {
        deviceStatus = when(statusCode) {
            1 -> "online"
            2 -> "offline"
            else -> "unknown"
        }
    }

    /*
    var speakerVolume: Int = 2
        set(value) {
            field = value
        }
        get() {
            return field
        }
     */

    fun turnOn() {
        println("Smart Device is turned on.")
    }

    fun turnOff() {
        println("Smart Device is turned off.")
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

        var speakerVolume = 2
            set(value) {
                if (field in 1..100){
                    field = value
                }
            }


        var channelNumber = 2
            set(value) {
                if (field in 0..200) {
                    field = value
                }
            }

    fun increaseVolume() {
        speakerVolume++
        println("Speaker volume increased to ${this.speakerVolume}")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number set to ${this.channelNumber}")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String) :
        SmartDevice(name = deviceName, category = deviceCategory) {

            var brightnessLevel = 0
                set(value) {
                    if (value in 0..100) {
                        field = value
                    }
                }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness level increased to ${this.brightnessLevel}")
    }
        }

fun main() {
    val smartTvDevice = SmartDevice(name = "Android TV", category = "Entertainment")
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}