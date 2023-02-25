fun main(args : Array<String>) {
    print("Enter a name:")
    var input1 = readLine()!!
    print("Enter another name:")
    var input2 = readLine()!!
    print("Enter one more name:")
    var input3 = readLine()!!
    var arr = arrayOf("$input1", "$input2", "$input3")
    arr.sort()
    for (x in arr) print("$x ")
}
