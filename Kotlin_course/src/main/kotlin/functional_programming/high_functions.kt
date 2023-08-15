package functional_programming

import syntax.sum

/* Функция высшего порядка - это функция, которая принимает в качестве параметра другую функцию


 */

fun main() {
    val result = modifyString("zalupa", {it.toUpperCase()}  )
   // println(result)

    val list = mutableListOf<Int>(1, 4, 5, 6)
   modifyCollection(list) {
       println(it.sum())
   }

}

fun modifyString(string: String, modify: (String) -> String): String {
    //string: String - первый параметр, который принимает строку
    //modify: (String) -> String - второй параметр, который принимает функцию, которая принимает первый параметр
    //при вызове параметра modify - лямбда-выражение, которое принимает всего один параметр
    // , поэтому можно обращаться  к нему через it и общие скобки можно не указывать:
    //val result = modifyString("zalupa") {it.toUpperCase()}

    return modify(string)
}

inline fun modifyCollection (mutableList: MutableList<Int>, modifyList: (MutableList<Int>) -> Unit) {
    modifyList(mutableList)
}

//если функция принимает в качестве параметра другую функцию, то функцию высокого порядка нужно объявлять как inline
// inline ставится для того, чтобы при вызоыве данной функции не создавался объект анонимного класса
//inline улучшает производительность - компилятор копирует содержимое inline функции при ее вызове, избегая создания объекта
