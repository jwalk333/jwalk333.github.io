
fun main() {
    printRules()
    val userChoice = getUserChoice()
    val computerChoice = getComputerChoice()
    printResult(userChoice, computerChoice)
}
fun getComputerChoice(): Int {
    return (Math.random() * (3 - 1 + 1)).toInt() + 1
}

fun printRules() {
    println("Let's play Rock Paper Scissors")
    println("The rules are:\n1. Rock beats Scissors\n2. Scissors beats Paper\n3. Paper beats Rock")
    println("1 is Rock\n2 is Paper\n3 is Scissor")
}

fun getUserChoice(): Int {
    print("Enter your choice (number): ")
    return readLine()!!.toInt()
}

fun printResult(userChoice: Int, computerChoice: Int) {
    if (userChoice == computerChoice)
        print("Tie game.")
    else if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0) || (userChoice == 2 && computerChoice == 1))
        print("You Won!")
    else
        print("You Lose.")
}
