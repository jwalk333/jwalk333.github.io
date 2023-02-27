fun main(args : Array<String>) {
    print("Enter the 1st runner's name:")
    var input1 = readLine()!!
    print("Enter 1st runner's time in minutes:")
    var input2 = readLine()!!
    val runner1 = Pair(input2, input1)
    print("Enter the 2nd runner's name:")
    var input3 = readLine()!!
    print("Enter 2nd runner's time in minutes:")
    var input4 = readLine()!!
    val runner2 = Pair(input4, input3)
    print("Enter the 3rd runner's name:")
    var input5 = readLine()!!
    print("Enter 3rd runner's time in minutes:")
    var input6 = readLine()!!
    val runner3 = Pair(input6, input5)
    var arr = arrayOf("$runner1", "$runner2", "$runner3")
    arr.sort()
    for (x in arr) print("$x ")
}
