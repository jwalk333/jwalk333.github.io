fun main (){
    println("Enter your question to reveal the answer from the magic 8 ball: ")
    val userQuestion = readLine()!!
    magicResponses()
    replay()
}

fun magicResponses (){
    val responses = arrayOf("Yes, of course!", "You can count on it.", "Ask me later.", "I’m not sure.", "I don’t think so.", "Without a doubt, no.")
    val min = 0
    val max = 5
    val randomNumber = (Math.random() * (max - min + 1)).toInt() + min
    val result = responses[randomNumber]
    println(result)
}

fun replay (){
    println("Do you have another question? Y or N: ")
    val userResponse = readLine()!!
    if(userResponse == "Y"){
        main()
    }
    else if(userResponse == "N"){
        println("See you next time!")
    }
    else {
        println("Invalid input.")
        replay()
    }
}
