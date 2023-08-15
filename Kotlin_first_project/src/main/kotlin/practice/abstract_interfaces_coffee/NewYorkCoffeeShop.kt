package practice.abstract_interfaces_coffee

class NewYorkCoffeeShop(AmericanoPrice: Double, CappuccinoPrice: Double, LattePrice: Double) :
    CoffeeShop(AmericanoPrice, CappuccinoPrice, LattePrice) {

    override fun makeAmericano() {
        println("Thank you for ordering americano in New York Coffee Shop")
    }

    override fun makeCappuccino() {
        println("Thank you for ordering cappuccino in New York Coffee Shop")
    }

    override fun makeLatte() {
        println("Thank you for ordering latte in New York Coffee Shop")
    }
}