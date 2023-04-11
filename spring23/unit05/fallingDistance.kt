fun main(args: Array<String>) {
    println("Enter the object's falling time in seconds: ")
    val fallingTime = readLine()!!.toDouble()
    println("The distance the object fell is ${fallingDistance(fallingTime)} meters.")
}
fun fallingDistance(fallingTime: Double): Double {
    val gravity = 9.8
    val exponent = 2
    val timeSquared = Math.pow(fallingTime.toDouble(), exponent.toDouble())
    return (.5) * (gravity * timeSquared)
}
