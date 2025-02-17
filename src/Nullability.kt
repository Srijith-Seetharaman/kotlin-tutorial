fun main(){
    var myFavouriteActor:String? = "Tom Hardy"
    println(myFavouriteActor)

    myFavouriteActor = null
    println(returnLengthOfFavActor(myFavouriteActor))

    myFavouriteActor = "Sandra Oh"
    println(returnLengthOfFavActor(myFavouriteActor))

    val nullableInteger:Int? = null
    println(nullableInteger)
}

fun returnLengthOfFavActor(actor:String?):Int {
    return actor?.length ?: 0
}