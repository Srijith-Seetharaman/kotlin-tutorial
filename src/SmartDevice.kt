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

    open fun turnOn() {
        deviceStatus = "On"
    }

    open fun turnOff() {
        deviceStatus = "Off"
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

    override fun turnOn() {
        super.turnOn()
        println(
            "${this.name} is turned on. Speaker volume is set to ${this.speakerVolume}, and channel number is set to " +
                    "${this.channelNumber}"
        )
    }

    override fun turnOff() {
        println(
            "${this.name} is turned off."
        )
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

    override fun turnOn() {
        brightnessLevel = 2
        println("${this.name} turned on. The brightness level is ${this.brightnessLevel}.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("${this.name} turned off.")
    }
}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {
    fun turnOnTv() {
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        smartTvDevice.turnOff()
        smartLightDevice.turnOff()
    }
}

fun main() {
    var smartDevice: SmartDevice = SmartDevice(name = "Android TV", category = "Entertainment")
    smartDevice.turnOn()
    smartDevice.turnOff()

    smartDevice = SmartTvDevice(deviceName = "Android TV", deviceCategory = "Entertainment")
    smartDevice.turnOn()
    smartDevice.turnOff()

    smartDevice = SmartLightDevice(deviceName = "Google Light", deviceCategory = "Utility")
    smartDevice.turnOn()
    smartDevice.turnOff()
    smartDevice.increaseBrightness()
}