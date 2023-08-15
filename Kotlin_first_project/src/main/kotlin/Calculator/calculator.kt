package Calculator

fun main() {
    println("Hello, it's calculator")
    while (true){
        println("Enter first number")
        val first = readLine()?.toDoubleOrNull()

        println("Enter second number")
        val second = readLine()?.toDoubleOrNull()

        println("Enter operator (+, -, *, /)")
        val operator = readLine()

        if (first == null || second == null || operator.isNullOrEmpty())
            println("Enter a valid character")
        else {
            if (operator != "+" && operator != "-" && operator != "*" && operator != "/") {
                println("Enter valid operator")
            }
            else  { var result =
                calculate(first, second, operator)
                println("Result is: $result")
            }
        }

    }

}

fun calculate (fi: Double, se: Double, op: String): Double{

    var res = 0.0

    when (op){
        "+" -> res = fi + se
        "-" -> res = fi - se
        "*" -> res = fi * se
        "/" -> res = fi / se
    }
    return res
}