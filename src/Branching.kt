fun main(){
    val trafficLight = "Yellow"
    branch(trafficLight)

    val num = 6
    isPrime(num)

    println(actionForTrafficLight(trafficLight))

    println(color(trafficLight))
}

fun branch(light: String) {
    when (light) {
        "Red", "Green", "Yellow" -> println("Valid traffic light color")
        else -> println("Invalid traffic light color")
    }
    when (light) {
        "Red" -> println("1. Stop")
        "Yellow" -> println("2. Wait")
        "Green" -> println("3. Go")
        else -> println("4. No action since the traffic color light is invalid")
    }

}

fun isPrime(number: Int) {
    when (number) {
        is Int -> println("Number is an integer")
        in 1..10 -> println("Number is between 1 and 10")
        else -> println("Number is not between 1 and 10")
    }
}

fun color(input: String) : String {
    val action = when (input) {
        "Red" -> "2. Stop"
        "Yellow" -> "1. Wait"
        "Green" -> "3. Go"
        else -> "5. Invalid traffic light color"
    }

    return action
}

fun actionForTrafficLight(trafficLight:String) : String {
    val actionForTrafficLight =
        if (trafficLight == "Yellow") "4. Wait"
        else if (trafficLight == "Green") "1. Go"
        else if (trafficLight == "Red") "2. Stop"
        else "3. Invalid traffic light color"

    return actionForTrafficLight
}