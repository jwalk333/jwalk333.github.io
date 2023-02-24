fun main() {
    var weight = 250
    var height = 72
    val exponent = 2
    val heightSquared = Math.pow(height.toDouble(), exponent.toDouble())
    val bodyMass = weight / heightSquared * 703
    if(bodyMass < 18.5){println("You are underweight")}
    else if(bodyMass > 25){println("You are overweight")}
    else{println("Your weight is optimal")}
}
