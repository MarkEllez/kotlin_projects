package oop.constructors

fun main() {
    var obj = example_constr("Rus", 144)
   // println(obj.name)

    //когда в параметрах класса указали дефолтные значения:
    //можно указывать только те параметры, которые хотим - но их явно нужно указать

    var obj1 = example_constr(population = 145)
    //println(obj1.population)


    var book1 = Book (year = 11, price = 111.22, name = "Pizda")
   // println(book1.name)
    println(book1.year)
    println(book1.price)
}