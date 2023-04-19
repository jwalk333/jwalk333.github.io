fun main() {
    printRules()
    playGame()
}

fun playGame (){
    val userChoice = getUserChoice()
    val computerChoice = getComputerChoice()
    when(computerChoice) {
        1 -> println("Computer chose Rock.")
        2 -> println("Computer chose Paper.")
        3 -> println("Computer chose Scissors.")
        else -> println("error")
    }
    printResult(userChoice, computerChoice)
    if(userChoice == computerChoice){
        replay()
    }
}
fun getComputerChoice(): Int {
    val min = 1
    val max = 3
    return (Math.random() * (max - min + 1)).toInt() + min
}

fun printRules() {
    println("Let's play Rock Paper Scissors")
    println("The rules are:\n1. Rock beats Scissors\n2. Scissors beats Paper\n3. Paper beats Rock")
    println("1 is Rock\n2 is Paper\n3 is Scissors")
}

fun getUserChoice(): Int {
    print("Enter your choice (number): ")
    return readLine()!!.toInt()
}

fun replay(){
    println("Rematch!")
    playGame()
}

fun printResult(userChoice: Int, computerChoice: Int) {
    if (userChoice == computerChoice) {
        print("Tie game.")
    }
    else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {
        print("You Won!")
    }
    else {
        print("You Lose.")
    }
}
