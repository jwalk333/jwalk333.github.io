fun main(args : Array<String>) {
    print("Enter a number from 1-10: ")
    var input = readLine()!!
    var number: Int = input.toInt()
        when(number)
        {1->println("I")
            2->println("II")
            3->println("III")
            4->println("IV")
            5->println("V")
            6->println("VI")
            7->println("VII")
            8->println("VIII")
            9->println("IX")
            10->println("X")
            else->println("error")}
    }
