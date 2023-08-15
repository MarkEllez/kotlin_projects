package Parametrization

fun main(){
    val money = Money(1000000000)
    val jewelery = Jewelery("Hui")

    val moneyCase = Case(money, 2)
    val jewCase = Case(jewelery, "KKK")

    moneyCase.add(Money(1000))
    jewCase.add(Jewelery("Pizda"))

    println(moneyCase.get())
    println(jewCase.get())

    funct(Case(Money(11111111), Jewelery("Rqwr")))


}

fun <T> funct (item: T){
    println("Hi $item")
}