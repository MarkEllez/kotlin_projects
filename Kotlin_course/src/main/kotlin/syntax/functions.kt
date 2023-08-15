package syntax

import kotlin.math.min
import java.util.*
import javax.print.DocFlavor.INPUT_STREAM
import kotlin.collections.ArrayList

fun main(){
    //firstEx("1234567")
    //println(firstEx2("1"))
    //println(summ(1,2,5,6))

    val arr = mutableListOf<Int>(4, 3, 6, 9, 1)
    val result = sort1(arr)
    for (i in result) {
        println(i)
    }

}

fun firstEx (s: String) {
     var str= s.substring(0, min(5, s.length))
    println(str)
}

fun firstEx2 (s: String) = s.substring(0, Math.min(5, s.length))

//методы firstEx и firstEx2 одинаковые

fun summ (vararg numbers: Int): Int {       //vararg - ключ слово для подставления любого кол-ва параметров
    var result = 0

    for (i in numbers){
        result += i
    }
    return result
}


//пузырьковая сортировка - первый способ

fun sort (numbers: MutableList<Int>): ArrayList<Int>{
    var sorted = false

    while (!sorted){
        sorted = true
        for (i in 1 until numbers.size){
            var previous = numbers[i - 1]
            var current = numbers[i]
            if (previous > current){
                var el1 = numbers[i]
                numbers[i] = numbers[i - 1]
                numbers[i - 1] = el1
                sorted = false
            }
        }
    }
    return ArrayList(numbers)
}


//пузырьковая сортировка - второй способ

fun sort1 (numbers: MutableList<Int>): List<Int>{
    for (i in 1 until numbers.size){
        for (j in numbers.size - 1 downTo i){
            if (numbers[j] < numbers[j -1]){
                var temp = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = temp
            }
        }
    }
    return numbers
}

//чтобы можно было передавать не только list, но и массивы и аргументы переменной длины, то

fun sort2 (numbers: Array<Int>) = sort1(numbers.toMutableList())
fun sort3 (vararg numbers: Int) = sort1(numbers.toMutableList())

//возвращает коллекцию числе в отсортированном виде, тип возвращаемой коллекции List
//в качестве параметра - массив, коллекция или vararg (аргументы переменной длины)
//если передаваемая в аргументе коллекция содержит в себе одинаковые элементы, то они должны сохраниться (поэтому исп-м List)
