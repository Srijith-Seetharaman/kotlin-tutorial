fun main() {
    val greeting: String = birthdayGreeting()
    println(greeting)
    println()
    println(birthdayGreeting())
    println()
    println(namedBirthdayGreeting("", 0))
    println()
    println(namedBirthdayGreeting(age = 28, name = "Srijith"))
    println()
    println(namedBirthdayGreeting(age = 12))
    println()
    println(namedBirthdayGreeting(name = "Srijith"))
    println()
    println(namedBirthdayGreeting(age = 1))
}

fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun namedBirthdayGreeting (name: String = "Rover", age: Int = 5) : String {
    val nameGreeting = "Happy Birthday $name!"
    val ageGreeting: String
    if (age == 1) {
        ageGreeting = "You are now 1 year old!"
    } else {
        ageGreeting = "You are now $age years old!"
    }
    return "$nameGreeting\n$ageGreeting"
}