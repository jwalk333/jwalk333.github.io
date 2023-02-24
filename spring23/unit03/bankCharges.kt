fun main(args : Array<String>) {
    print("Enter the number of checks you've written per month to display monthly fee: ")
    var input = readLine()!!
    var checks: Int = input.toInt()
    if(checks < 20){println(checks * .10 + 10) }
    else if(checks in 21..38){ println(checks * .08 + 10) }
    else if(checks in 40..59){ println(checks * .08 + 10) }
    else if(checks in 40..59){ println(checks * .06 + 10) }
    else{ println(checks * .04 + 10) }
}
