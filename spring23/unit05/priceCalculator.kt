fun main(args: Array<String>) {
    println("Enter the item's wholesale cost: ")
    val wholesale = readLine()!!.toDouble()
    println("Enter the item's markup percentage: ")
    val markup = readLine()!!.toDouble()
    println("The item's retail price is $${calculateRetail(wholesale, markup)}")
}
fun calculateRetail(wholesale: Double, markup: Double): Double {
    return wholesale + (wholesale * markup / 100)
}
