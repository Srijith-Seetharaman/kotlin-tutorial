val name: String = "Srijith"
/* Invalid code because if variables are to be declared in one places and its value
   initialized somewhere else, the type of the variable should be bound at the point
   of declaration
var myName
val myName1
/myName1 = name
*/

fun main(){
    val myName: String
    myName = "Srijith1"
    println(myName)
//    name = "helpMe"
    println(name)

    var myAge : Int = 28

    var fullString = "$myName $myAge"
    println(fullString)
}