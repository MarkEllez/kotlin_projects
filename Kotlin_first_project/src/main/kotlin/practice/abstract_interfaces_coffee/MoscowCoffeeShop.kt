package practice.abstract_interfaces_coffee

class MoscowCoffeeShop(AmericanoPrice: Double, CappuccinoPrice: Double, LattePrice: Double) :
    CoffeeShop(AmericanoPrice, CappuccinoPrice, LattePrice), Biscuits {

    override fun makeAmericano() {
        AmericanoCount++
        println("Thank you for ordering americano in Moscow Coffee Shop")
    }

    override fun makeCappuccino() {
        CappuccinoCount++
        println("Thank you for ordering cappuccino in Moscow Coffee Shop")
    }

    override fun makeLatte() {
        LatteCount++
        println("Thank you for ordering latte in Moscow Coffee Shop")
    }

    override fun isBiscuits() {
        println("Take your biscuits")
    }
}