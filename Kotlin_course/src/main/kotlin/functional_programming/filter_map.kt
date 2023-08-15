package functional_programming

fun main() {

    val arr = mutableListOf<Int>()
    for (i in 0..99){
        arr.add(i)
    }
    //  println(arr)

    //вывести только четные числа
    val numbersOfList = arr.filter {it % 2 == 0}
    for (i in numbersOfList){
    //    println(i)
    }

    //task 1

    val listOfNames = mutableListOf<String>("Petya", "Katya", "afff", "ggg", "Artem")
    val namesWithA = listOfNames.filter { it.startsWith('a', ignoreCase = true) }
    for (i in namesWithA) {
        // println(i)
    }

     //функция Map - позволяет изменить коллекцию (будет вызывать переданную нами функцию у каждого элемента)
    // и создать новую коллекцию с другим типом

    val numbers = (0..100).toList()
    val maps = numbers.map { "Employee №$it" }
    for (i in maps){
        println(i)
    }

    //метод sorted - позволяет осортировать коллекцию или массив

    val ss = arrayOf(1, 4, 2, -5, 0)
    val ww = ss.sorted()    //отсортировать по убыванию - .sortDescending()
    for (i in ww){
       // println(i)
    }


    //homework

    val collec = mutableListOf<Int>()
    for (i in 0 until 1000){
        collec.add((Math.random()*1000).toInt())
    }
    val onlyFiveOrThree = collec.filter { it % 5 == 0 || it % 3 == 0}
    val square = onlyFiveOrThree.map { it * it }
    val sortCollec = square.sortedDescending()
    val collecString = sortCollec.map { "\"$it\"" }
    for (i in collecString){
       // println(i)
    }

    //or
    val ccc = collec.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map { "\"$it\"" }
    for (i in ccc){
      //  println(i)
    }
}



//val numbersOfList = arr.filter ({ number -> number % 2 == 0   }) - если параметр только один или он последний, то
// круглые скобки можно не ставить

// если параметр на входе один (в примере Int) - то вместо number -> number % 2 == 0 можно поставить it % 2 == 0

/*

*/