fun main(args : Array<String>) {
        println("Is anyone vegetarian?: ")
        var input1 = readLine()!!
        println("Is anyone vegan?: ")
        var input2 = readLine()!!
        println("Is anyone gluten-free?: ")
        var input3 = readLine()!!
        if (input1 == "no" && input2 == "no" && input3 == "no") {
            println("Here are your restaurant choices: Joe’s Gourmet Burgers")}
        else if(input1 == "yes" && input2 == "no" && input3 == "yes") {
            println("Here are your restaurant choices: Main Street Pizza Company")}
        else if(input1 == "yes" && input2 == "no" && input3 == "no") {
            println("Here are your restaurant choices: Mama’s Fine Italian")}
        else{println("Here are your restaurant choices: The Chef’s Kitchen & Corner Café")}
    }
