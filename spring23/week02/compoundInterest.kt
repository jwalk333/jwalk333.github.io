    fun main() {
        var p = 10000
        val r = .02 
        val rate = r * 100
        val n = 4
        var t = 3
        val base = (1 + (r / n)) 
    	  val exponent = n*t
    	  val result = Math.pow(base, exponent.toDouble())
        var dollarAmount = Math.round(result * p)
    	  println("After $t year(s) with an interest rate of $rate%, your principal amount of $$p is now $$dollarAmount.")
}
