import java.sql.Array
import java.util.*

fun main (){

/*
println("Hello, bitches")

    var myInt: Int = 12 //можно редактировать в дальнейшем
    val myInt1: Int = 13 //нельзя редактировать в дальнейшем

    val myString: String? = null // ? - указывает на вероятность хранения значения null для данной переменной

    val myInt2 = 15 // : и Тип переменной можно не указывать, если сразу присваиваем значение

    myInt+=2
    println(myInt)
//________________________________________________________________________________________________
    // Условные операторы

    if (myInt > 10 && myInt < 20) // && исп-ся для объединения двух условий
        println("zalupa")

    //Цикл for

    for (i in 1..10 step 2){   // step - указывает, что будет выводиться каждая 2 строка
        println("$i - infinite dickhead") //$ - выведет номер цикла
    }


    for (i in 100 downTo 1){   // downTo - для вывода цикла от большего к меньшему
        println("$i - infinite dickhead") //$ - выведет номер цикла
    }
//________________________________________________________________________________________________
    // Массивы - для хранения данных одного типа

    val numbers = arrayOf(1, 2)

    for(i in numbers){
        println(i)
    }
   // numbers[0] = 13 // как поменять значение в индексе массива

    var i = 0
    while (i in numbers){
        println(numbers[i])
        i++
    }

    //как узнать размер массива

    val str = arrayOf("one", "two", "three")
    println(str.size)
//________________________________________________________________________________________________

    //синтаксис for each c условием

//    str.forEach { i ->
//        if (i == "one") println("skip")
//        else println(i) }

    // for each с доступом к индексу

    str.forEachIndexed { index, s ->    //index можно обозначить любой переменной - она всегда отвечает за значение индекса
        println("$index has such value as $s")
    }

//________________________________________________________________________________________________

    //работа со строками
    val s = "String"
    println(s[s.length-1])   //как вывести последний элемент в строке (обращение через индексы массивов)
    println(s.first())  //как вывести первый символ в строке
    println(s.last())  //как вывести последний символ в строке

    val cardNumber = "1234 5678 9010 2323"
    println(cardNumber.startsWith("12"))   //как вывести начало строки - возвращает булево значение
    println(cardNumber.endsWith("23"))   //как вывести конец строки - возвращает булево значение

    //как вызывать функцию или метод внутри строки - нужно добавить фигурные скобки
    println("${cardNumber.length}")
    //как экранировать символы в строке - \ перед символом
    //как перенести строку  \n

    //как сделать первую букву в строке заглавной
    val ss = "john"
    println(ss.capitalize())

    //как сделать все символы заглавными
    println(ss.toUpperCase())

    //как проверить пустая строка или нет
    println(ss.isEmpty())

    //как проверить есть ли в строке полезные символы
    println(ss.isBlank())

    //как заменить строку
    var t = ss.replace("j", "p")

    //как разделить/разбить строку
    val vv = "Milk, Bread, Coffee"
    var v = vv.split(",")
    println(v[0])

    //как сделать так чтоб не вывелась ошибка NullPointerException

    val input = readLine()
    println(input?.uppercase(Locale.getDefault()))


//________________________________________________________________________________________________

    //Использование функций

    val mas = arrayOf("John", "Bob", "Lolita")

    smallFunc(mas)

}

fun smallFunc (arr: kotlin.Array<String>) {
    for (name in arr){
        if (name == "John") println("It is a John")
        else if (name == "Bob") println("It is a Bob")
        else if (name == "Lolita") println("It is a Lolita")
        else name == "blank"
    }

 */

    val x = 2
    val y = 2

    val result = smf(x, y)

    println(result)
}

fun smf(x: Int, y: Int): Int{
   return x + y
}