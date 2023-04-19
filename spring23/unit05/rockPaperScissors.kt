fun main() {
    printRules()
    val userChoice = getUserChoice()
    val computerChoice = getComputerChoice()
    if(getComputerChoice() == 1){
        println("Computer chose: Rock.")
    }
    else if(getComputerChoice() == 2){
        println("Computer chose: Paper.")
    }
    else{
        println("Computer chose: Scissors.")
    }
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

fun replay(){
    println("Rematch!")
    getUserChoice()
}

fun printResult(userChoice: Int, computerChoice: Int) {
    if (userChoice == computerChoice) {
        print("Tie game.")
        replay()
    }
    else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {
        print("You Won!")
    }
    else {
        print("You Lose.")
    }
}
