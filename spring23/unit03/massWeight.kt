fun main(args : Array<String>) {
    print("Enter your object's mass in kilograms: ")
    var input1 = readLine()!!
    var mass: Int = input1.toInt()
    val weight = mass * 9.8
    println("Your object weighs $weight Newtons.")
    if(weight > 1000){println("Your object is too heavy.")}
    else if(weight < 10){println("Your object is too light.")}
}
