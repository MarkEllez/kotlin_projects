package functional_programming

import kotlin.math.absoluteValue
import kotlin.math.max

fun main() {
    val data = mapOf<String, List<Int>>(
        "Январь" to listOf<Int>(100, 100, 100, 100),     //вся строка - это it, чтобы взять только значения list - добавить .value
        "Февраль" to listOf<Int>(200, 200, -190, 200),
        "Март" to listOf<Int>(300, 180, 300, 100),
        "Апрель" to listOf<Int>(250, -250, 100, 300),
        "Май" to listOf<Int>(200, 100, 400, 300),
        "Июнь" to listOf<Int>(200, 100, 300, 300)
        //для создания объекта: используется объект типа Pair
        //,Pair("file5", listOf(1, 3, 4, 2))
    )


    //нужно отфильтровать значения в коллекции коллекций выше, и если хоть одно значение в коллекции < 0,
    // то не брать в расчет всю коллекцию

    //метод all - берет все значения из коллекции, только если ВСЕ значения удовлетворяют условию

    val takeAll = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }
    //println(takeAll)

    //метод Any - берет только ту коллекцию, в которой хотя бы одно значение в ней удовлетворяет условию
    //чтобы выполнить задание выше, нужно использовать filterNot

    val takeAny = data.filterNot { it.value.any{ it < 0} }.flatMap { it.value }
    //println(takeAny)


    //homework
    /* создать метод printInfo, который будет содержать: (исп-ть только корректные данные
      - исключить месяцы, в которых есть отрицательная выручка)
    * Средняя выручка в неделю
    * Средняя выручка за месяц
    * Мин и макс выручки в месяц и названия месяцев, на которые пришлась такая выручка
    * Названия месяцев, в данных которых содержатся ошибки
    */

    //средняя выручка в неделю

    //val averageWeek = data.filter { it.value.all { it > 0 } }.flatMap { it.value }.average()
    //println(averageWeek)
    //val averageMonth = data.filter { it.value.all { it > 0 } }.map { it.value }.sumOf { it.average() }
    //println(averageMonth)
    //val maxMonth = data.filter { it.value.all { it > 0 } }.map { it.value }.sumOf { it.max() }
    //println(maxMonth)
   // val minMonth = data.filter { it.value.all { it > 0 } }.map { it.value }.sumOf { it.min() }
    //println(minMonth)
    val nameOfMaxMonth = data.filter { it.value.all { it > 0 } }.map { it.component1(

    ) }
   // println(nameOfMaxMonth)

    printInfo(data)


}

fun printInfo (datat: Map<String, List<Int>>){
    val validData = datat.filter { it.value.all { it > 0 } }
    val sumData = validData.map { it.value.sum() }
    val averageWeek = validData.flatMap { it.value }.average()
    println("Средняя выручка в неделю: $averageWeek")

    val averageMonth = sumData.average()
    println ("Средняя выручка в месяц: $averageMonth")

    val maxMonth = sumData.max()
    println ("Максимальная выручка в месяц: $maxMonth")

    val minMonth = sumData.min()
    println ("Минимальная выручка в месяц: $minMonth")

    val maxMonths = validData.filter { it.value.sum() == maxMonth }.keys
        print("Месяцы, в которых выручка была максимальной: ")
    for (i in maxMonths){
        println("$i ")
    }

    val minMonths = validData.filter { it.value.sum() == minMonth }.keys
     print("Месяцы, в которых выручка была минимальной: ")
    for (i in minMonths){
        println("$i ")
    }

    val errorMonths = datat.filter { it.value.any{it < 0}}.keys
        print("Месяцы, в которых выручка была отрицательной: ")
    for (i in errorMonths){
        print("$i ")
    }

}

//как вывести только строку из массива с string и list<Int> - добавить .keys
//что такое функция высшего порядка: эта та функция, у которой в качестве вовзращаемого значения функция или
// в качестве параметра принимается функция