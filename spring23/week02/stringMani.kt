//Feb. 23 revision 

fun main(args : Array<String>) {
    print("Enter a city: ")
    var input = readLine()!!
    println(input.uppercase())
    println(input.lowercase())
    println("The number of characters in your favorite city is: " + input.length)
    println("The first character of your favorite city is: " + input[0])
}
