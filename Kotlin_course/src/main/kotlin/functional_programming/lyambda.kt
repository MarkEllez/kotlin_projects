package functional_programming

import kotlin.Array
import kotlin.Array as Array1

fun main() {
    //val temp = {a: Int, b: Int -> a + b}
    // val temp1:(Int, Int) -> Int = {a, b -> a + b}
    //  val square: (Int) -> Int = {a -> a * a}

    //println( // temp1(1, 44)
    // square(3))

    //homework
    //first task
    val hw1: (Int, Int) -> Int = { a, b -> ((a + b) * 2) }
    println(hw1(2, 4))

    //second task
    val hw2: (String) -> Unit = { println("Привет, $it!") }
    hw2("Катя")

    //также мы можем вызвать лямбда-выражение в новой переменной:
   // val temp = hw1(1, 5) - результат будет 12

/*
    //third task - принимает и возвращает массив, отсортированный по убыванию

    val hw3: (Array<Int>) -> Array<Int> = {
        for (i in 1 until it.size){
            for (j in it.size - 1 downTo i){
                if (it[j - 1] > it[j]){
                    var temp = it[j]
                    it[j] = it[j - 1]
                    it[j - 1] = temp
                }
            }
        }
        it
    }
    val sorted = hw3(arrayOf(1, 4, -9, 0, 8))
    for (i in sorted){
        println(i)
    }
*/


    //Повтор 3 задачи
    /*
    Принимаем на вход массив чисел и возвращаем массив чисел, отсортированный по убыванию

    Можно воспользоваться пузырьковой сортировкой. Нужно идти с конца массива до его начала.
    Первый цикл for (i in it.size - 2 downTo 0) - означает, что нужно сравнивать предпоследний элемент с последним

    Пузырьковая сортировка - если по убыванию, то нужно сравнивать предпоследний элемент (size - 2 или j) с последним (j + 1)
    */
    val sort: (Array<Int>) -> Array<Int> = {
        for (i in it.size - 2 downTo 0){
            for (j in 0..i){
                if (it[j] < it[j + 1]){
                    var temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }

    val sortt = sort(arrayOf(1, 4, -3, 6, 0, 99))
    for (i in sortt){
        println(i)
    }



}


//Для создания лямбда-выражения необходимо после объявления перменной и знака равно
//поставить фигурные скобки
//Так как данная функция создается без имени - это значит, что она анонимная.
//А анонимная функция - это лямбда-выражение.
//Пример: val temp


//Но также можно указывать тип переменной, тип параметров и вовзвращаемое значение в явном виде
//пример: val temp1

//В Kotlin мы можем присваивать переменным значения функции - то есть переменная и будет являться функцией

/*

Лямбда-выражение – это функция, записанная в виде выражения, и которую можно передавать как аргумент в другие функции.
В свою очередь обычные функции могут возвращать лямбды.

Лямбда-выражения иногда называют анонимными функциями, потому что у них нет имен.


Если лямбда-выражение не принимает параметров, оставляем скобки пустыми ()
если лямбда-выражение ничего не возвращает - после знака -> ставим Unit (аналог void в Java)
val tt = () -> Unit = ...
Далее после знака = в фигурных скобках описываем тело функции

Если параметр в лямбда-выражении всего один, то его можно явно не указывать, компилятор будет сам знать, что
мы используем именно этот параметр. Пример (нужно получить квадрат принимаемого параметра):

val tt = (Int) -> Int = {it * it}

https://younglinux.info/kotlin/lambda

видео про лямбда
https://www.youtube.com/watch?v=3v_QlWC63Pw&ab_channel=%D0%9C%D0%BE%D0%B1%D0%B8%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9%D1%80%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D1%87%D0%B8%D0%BA

 */
