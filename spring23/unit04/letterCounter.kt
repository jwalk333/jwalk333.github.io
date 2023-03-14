fun main() {
    print("Enter a string: ")
    var input1 = readLine()!!
    print("Enter a character: ")
    var input2 = readLine()!!
    val c: Char = input2.first()
    var count = 0
    for (x in input1) {
        if (x == c) {
            count++
        }
    }
    println("There are $count instances of that character in your string")
}
