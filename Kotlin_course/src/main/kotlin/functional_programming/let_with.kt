package functional_programming

var name: String? = null

fun main() {
    name?.let {
        if (it.length > 5){         //it и есть name
          //  println("zalupa")
        }
    }

//Функция let - вызывается у объекта, если нам нужно произвести действие с ним, зная что объект не равен null
//если объект равен null, то функция let выполняться не будет

    //TASK 1 - создать коллекцию чисел, вывести сумму чисел, среднее число, макс, мин, первое и последнее числа

    //коллекция
    val array = mutableListOf<Int>()
    for (i in 0 until 1000){
        array.add((Math.random()*100).toInt())
    }
/*
    val sum = array.sum()
    println("Сумма чисел: $sum")

    val average = array.average()
    println("Среднее число: $average")

    val max = array.max()
    println("Максимальное число: $max")

    val min = array.min()
    println("Минимальное число: $min")

    val first = array.first()
    println("Первое число: $first")

    val last = array.last()
    println("Последнее число: $last")
*/
    //чтобы каждый раз при вызове метода не указывать имя объекта, можно использовать ключ слово with:

    val array1 = mutableListOf<Int>()
    with(array1){
        for (i in 0 until 1000){
            add((Math.random()*100).toInt())        //имя коллекции можно не указывать (можно указать this)
        }

        println(sum())
        println(average())
        println(max())
        println(min())
        println(first())
        println(last())
    }



}


