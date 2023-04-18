val roomList =
    arrayOf("Bedroom 2", "South Hall", "The Dining Room", "Bedroom 1", "North Hall", "Kitchen", "Balcony")
var currentRoom = 0

fun main (){
    intro()
    println("You are currently in ${roomList[currentRoom]}.")
    while (currentRoom != 6) {
        when(getUserChoice()){
           "n" -> moveNorth()
            "s" -> moveSouth()
            "e" -> moveEast()
            "w" -> moveWest()
            else -> println("error")
        }
        println("You are now in ${roomList[currentRoom]}.")
    }
    println("Game over!")
}

fun intro (){
    println("You have entered a haunted castle. To make it out you must find the Balcony.")
    println("To navigate, enter N for North, S for South, E for East and W for West.")
}

fun getUserChoice (): String {
    println("What is your next move: N, S, E, or W?")
    val userChoice = readLine()!!.lowercase()
    return userChoice
}

fun moveNorth() {
    when (currentRoom) {
        0 -> currentRoom = 3
        1 -> currentRoom = 4
        2 -> currentRoom = 5
        3 -> println("error")
        4 -> currentRoom = 6
        5 -> println("error")
    }
}

fun moveSouth() {
    when (currentRoom) {
        0 -> println("You have hit a wall!")
        1 -> println("Oh no! You can't go that way.")
        2 -> println("Wrong way.")
        3 -> currentRoom = 0
        4 -> currentRoom = 1
        5 -> currentRoom = 2
    }
}

fun moveEast() {
    when (currentRoom) {
        0 -> currentRoom = 1
        1 -> currentRoom = 2
        2 -> println("You just ran into a wall!")
        3 -> currentRoom = 4
        4 -> currentRoom = 5
        5 -> println("You can't go that way. Sorry!")
    }
}

fun moveWest() {
    when (currentRoom) {
        0 -> println("Wrong way.")
        1 -> currentRoom = 0
        2 -> currentRoom = 1
        3 -> println("There is a wall right there.")
        4 -> currentRoom = 3
        5 -> currentRoom = 4
    }
}
