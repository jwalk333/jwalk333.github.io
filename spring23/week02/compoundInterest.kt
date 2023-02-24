fun main(args : Array<String>) {
    print("Enter your initial deposit: ")
    var input1 = readLine()!!
    var p: Int = input1.toInt()
    print("Enter your interest rate: ")
    var input2 = readLine()!!
    var rate: Int = input2.toInt()
    var r = rate * .01
    print("Enter the number of times per year that the interest is compounded: ")
    var input3 = readLine()!!
    var n: Int = input3.toInt()
    print("Enter the number of years the account will be left to earn interest: ")
    var input4 = readLine()!!
    var t: Int = input4.toInt()
    val base = (1 + (r / n))
    val exponent = n*t
    val result = Math.pow(base, exponent.toDouble())
    val dollarAmount = Math.round(result * p)
    println("After $t year(s) with an interest rate of $rate%, your principal amount of $$p is now $$dollarAmount.")
}
