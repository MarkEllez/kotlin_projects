package practice.abstract_interfaces_coffee

abstract class CoffeeShop (val AmericanoPrice: Double, val CappuccinoPrice: Double, val LattePrice: Double) {

    var AmericanoCount = 0
    var CappuccinoCount = 0
    var LatteCount = 0

    abstract fun makeAmericano ()
    abstract fun makeCappuccino ()
    abstract fun makeLatte ()

    fun showStatistics(){
        println("Americano sold: $AmericanoCount")
        println("Cappuccino sold: $CappuccinoCount")
        println("Latte sold: $LatteCount")

        val money = AmericanoCount*AmericanoPrice + CappuccinoCount*CappuccinoPrice + LatteCount*LattePrice

        println("Money earned: $money")

    }

}