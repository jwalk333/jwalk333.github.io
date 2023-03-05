fun main() {
    var userInput: Int? = null
    while (userInput == null) {
        print("Enter a positive integer: ")
        val input = readLine()
        try {
            userInput = input?.toInt()
            if (userInput != null && userInput < 0) {
                println("Invalid input. Please enter a positive integer.")
                userInput = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    var i = 1
    var sum = 0
    while (i <= userInput) {
        sum += i
        i++
    }
    println(sum)
}
