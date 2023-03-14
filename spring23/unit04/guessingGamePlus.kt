fun main() {
    val min = 1
    val max = 10
    var count: Int = 0
    val randomNumber = (Math.random() * (max - min + 1)).toInt() + min
    var userInput: Int? = null
    while (userInput == null) {
        print("Enter a number between 1 and 10: ")
        val input = readLine()
        try {
            userInput = input?.toInt()
            if (userInput != null && userInput < randomNumber) {
                println("Too low. Guess again.")
                userInput = null
            }
            else if(userInput != null && userInput > randomNumber){
                println("Too high. Guess again")
                userInput = null
            }
            else {
                println("Correct!")
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a number between 1 and 100.")
        }
        count++
        print("Guess count: $count")
    }
}
