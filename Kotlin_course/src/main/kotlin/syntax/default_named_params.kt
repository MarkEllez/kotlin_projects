package syntax

fun main() {
    //printInfo_1("Какашкин", "Анатолий")

   // printInfo_2(name = "Залупа")
    val vv = vol_paral(first = 4, second = 2)
    println(vv)

}

//Дефолтный параметр
/*
Для того чтобы не создавать перегруженный метод, в котором не будет использоваться какой-либо из параметров
то можно этому параметру в методе присвоить дефолтное значение. И тогда при вызове этого метода не нужно будет указывать
значение этого параметра, которому присвоено дефолтное значение.
 */

fun printInfo_1 (lastName: String, name: String, patronymic: String = ""){
    println("LastName is: $lastName\nName is: $name")
    if (!patronymic.isNullOrEmpty()){
        println("Patronymic is: $patronymic")
    }
}

//Именованный параметр
/*
К примеру можно указывать для каких конкретно параметров мы добавляем значение
- для этого нужно написать имя параметра = "значение" при вызове метода.
Параметры можно передавать в любом порядке
Пример ниже
*/


fun printInfo_2 (lastName: String = "", name: String = "", patronymic: String = ""){
    if (lastName.isNotEmpty()){                 //то же самое, что и !.isEmpty
        println("LastName is: $lastName")
    }
    if (name.isNotEmpty()){
        println("Name is: $name")
    }
    if (patronymic.isNotEmpty()){
        println("Patronymic is: $patronymic")
    }
}


//Домашнее задание
/*
Рассчитать объем параллелепипеда. В качестве параметра должно передаваться от 1 до 3 сторон
Если передана одна сторона, то считается, что все стороны равны.
Если переданы две стороны, то считается, что 1 и 3 стороны равны

Метод должен быть один - без перегрузок
Метод должен быть записан в одну строку, без слова return
*/

fun vol_paral(first: Int, second: Int = first, third: Int = first) = first*second*third