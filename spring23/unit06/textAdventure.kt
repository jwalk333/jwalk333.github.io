
val roomList =
    arrayOf("Bedroom 2", "South Hall", "The Dining Room", "Bedroom 1", "North Hall", "Kitchen", "Balcony")
var currentRoom = 0

fun main (){
    println("You are currently in ${roomList[currentRoom]}.")
    val done = false
    while (!done) {
        when(getUserChoice()){
           "n" -> moveNorth()
            "s" -> moveSouth()
            "e" -> moveEast()
            "w" -> moveWest()
            else -> println("error")
        }
        println("You are now in ${roomList[currentRoom]}.")
    }
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
        6 -> println("You've made it to the balcony!")
    }
}

fun moveSouth() {
    when (currentRoom) {
        0 -> println("error")
        1 -> println("error")
        2 -> println("error")
        3 -> currentRoom = 0
        4 -> currentRoom = 1
        5 -> currentRoom = 2
        6 -> currentRoom = 4
    }
}

fun moveEast() {
    when (currentRoom) {
        0 -> currentRoom = 1
        1 -> currentRoom = 2
        2 -> println("error")
        3 -> currentRoom = 4
        4 -> currentRoom = 5
        5 -> println("error")
        6 -> println("error")
    }
}

fun moveWest() {
    when (currentRoom) {
        0 -> println("error")
        1 -> currentRoom = 0
        2 -> currentRoom = 1
        3 -> println("error")
        4 -> currentRoom = 3
        5 -> currentRoom = 4
        6 -> println("error")
    }
}
