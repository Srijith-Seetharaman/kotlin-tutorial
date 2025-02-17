fun main() {
    val trafficLight = "Blue"
    trafficFun(trafficLight)

}

fun trafficFun(light: String) {
    if (light == "Red") {
        println("Stop")
    } else if (light == "Yellow") {
        println("Wait")
    } else if (light == "Green"){
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }
}