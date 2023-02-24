fun main(args : Array<String>) {
    print("Enter your height in inches: ")
    var input1 = readLine()!!
    var height: Int = input1.toInt()
    print("Enter your weight in pounds: ")
    var input2 = readLine()!!
    var weight: Int = input2.toInt()
    val exponent = 2
    val heightSquared = Math.pow(height.toDouble(), exponent.toDouble())
    val bodyMass = weight / heightSquared * 703
    if(bodyMass < 18.5){println("You are underweight")}
    else if(bodyMass > 25){println("You are overweight")}
    else{println("Your weight is optimal")}
}
