fun main() {
    println("Fahrenheit\tCelsius");
    for (i in 0..20) {
        var ctemp = celsius(i);
        println("$i\t\t$ctemp");
    }
}

fun celsius(temp:Int) : Double {
    var ctemp = (5.0/9.0)*(temp-32);
    return ctemp;
}
