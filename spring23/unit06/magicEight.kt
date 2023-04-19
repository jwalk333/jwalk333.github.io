fun main (){
    println("Enter your question to reveal the answer from the magic 8 ball: ")
    val userQuestion = readLine()!!
    magicResponses()
    replay()
}

fun magicResponses (){
    val responses = arrayOf("Yes, of course!", "You can count on it.", "Undoubtedly, yes.", "Ask me later.", "I’m not sure.", "I don’t think so.", "Without a doubt, no.", "I cannot find the answer for you.","The answer is foggy at the moment.", "Absolutely, no")
    val min = 0
    val max = 9
    val randomNumber = (Math.random() * (max - min + 1)).toInt() + min
    val result = responses[randomNumber]
    println(result)
}

fun replay (){
    println("Do you have another questions? Y or N: ")
    val userResponse = readLine()!!.lowercase()
    if(userResponse == "y"){
        main()
    }
    else if(userResponse == "n"){
        println("See you next time!")
    }
    else {
        println("Invalid input.")
        replay()
    }
}
