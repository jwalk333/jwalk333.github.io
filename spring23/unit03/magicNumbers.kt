fun main(args : Array<String>) {
    print("Enter a month in numeric form: ")
    var input1 = readLine()!!
    var month: Int = input1.toInt()
    print("Now enter a day: ")
    var input2 = readLine()!!
    var day: Int = input2.toInt()
    print("Finally, enter a 2-digit year: ")
    var input3 = readLine()!!
    var year: Int = input3.toInt()
    val magicNumber = month * day
    if(year==magicNumber){println("The day is magic")}
    else{println("The day is not magic")}

}
