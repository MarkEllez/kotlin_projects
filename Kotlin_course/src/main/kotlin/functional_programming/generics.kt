package functional_programming

//generic - установка параметризированного типа
//методы и классы могут использовать объекты, типы которых на момент определения классов и функций неизвестны.

fun main() {
    val ss = mutableMapOf<String, String>()
    myWith(ss){
       // println(keys)
    }
}


//написать свою функцию with
//функция принимает два параметра- какой-то объект и функцию
//так как функция myWith принимает в качестве параметра другую фунцкию напишем inline
//чтобы не писать какой-то конкретный объект - укажем тип Т - T.()
//так как указали тип T - укажем Т возле fun
//чтобы в качестве возвращаемого значения для функции operation не указывать конкретный тип, укажем тип R
//так как указали тип R для функции operation - укажем R для fun
//так как в body функции myWith указали return, то надо этот тип указать после () для функции myWith

inline fun<T, R> myWith (obj: T, operation: T.() -> R ): R {
    return operation(obj)
}

//как бы функция myWith выглядела без использования generics

inline fun myWith1 (obj: String, operat: String.() -> Unit) {
     operat(obj)
}