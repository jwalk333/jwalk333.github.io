fun profit (numberOfShares: Int, purchasePrice: Int, purchaseCommission: Int, salePrice: Int, saleCommission: Int): Int {
    val profitCalculated = ((numberOfShares * salePrice)-saleCommission)-((numberOfShares * purchasePrice)+purchaseCommission)
    if(profitCalculated > 0){
        println("You profited from this sale.")
    }
    else if(profitCalculated < 0){
        println("You took a loss with this sale.")
    }
    else{
        println("There was neither a profit or loss.")
    }
    return profitCalculated
}

fun main (){
    println("Enter the number of shares: ")
    val numberOfShares = readLine()!!.toInt()
    println("Enter the purchase price per share: ")
    val purchasePrice = readLine()!!.toInt()
    println("Enter the purchase commission paid: ")
    val purchaseCommission = readLine()!!.toInt()
    println("Enter the sale price per share: ")
    val salePrice = readLine()!!.toInt()
    println("Finally, enter the sale commission paid: ")
    val saleCommission = readLine()!!.toInt()
    println("Calculated sale: $${profit(numberOfShares, purchasePrice,purchaseCommission, salePrice, saleCommission)}")
}
