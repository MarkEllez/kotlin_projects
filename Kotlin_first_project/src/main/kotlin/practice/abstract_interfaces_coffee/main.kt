package practice.abstract_interfaces_coffee

import kotlin.system.exitProcess

fun main () {

    val MoscowCoffee = MoscowCoffeeShop(3.0, 4.5, 5.0)
    val NewYorkCoffee = NewYorkCoffeeShop(5.0, 7.5, 8.0)
    var currentCoffeeShop: CoffeeShop

    while (true){

        println("Hello. PLease choose a city: ")
        println("1. Moscow\n2. New York\n\n0. Exit")

        when (readLine()) {
            "1" -> currentCoffeeShop = MoscowCoffee
            "2" -> currentCoffeeShop = NewYorkCoffee
            "0" -> break
            else -> {
                println("Error")
                continue
            }
        }

        chooseDrink(currentCoffeeShop)

    }
}

private fun chooseDrink (currentCoffeeShop: CoffeeShop) {
    println("Please choose a drink:")
    println("1. Americano\n2. Cappuccino\n3. Latte\n0. Show Statistics")

    when (readLine()) {
        "1" -> {
            currentCoffeeShop.makeAmericano()
            checkAndAskForBiscuits(currentCoffeeShop)
        }

        "2" -> {
            currentCoffeeShop.makeCappuccino()
            checkAndAskForBiscuits(currentCoffeeShop)
        }

        "3" -> {
            currentCoffeeShop.makeLatte()
            checkAndAskForBiscuits(currentCoffeeShop)
        }

        "0" -> currentCoffeeShop.showStatistics()
        else -> {
            println("Error")
            exitProcess(1)
        }
    }
}

fun checkAndAskForBiscuits (currentCoffeeShop: CoffeeShop){
    if (currentCoffeeShop is Biscuits) {
        println("Would you like to take biscuits?")
        println("1. Yes\n2. No")

        when (readLine()) {
            "1" -> currentCoffeeShop.isBiscuits()
        }
    }
}