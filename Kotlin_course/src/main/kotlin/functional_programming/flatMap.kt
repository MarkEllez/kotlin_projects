package functional_programming

fun main() {
    //как создать массив в массиве
    //создать двумерный массив и вычленить из него массивы

    val revenueByWeek = listOf(
        listOf<Int>(1,2,3,5,33,45),
        listOf<Int>(99,4,3,12,62,12),
        listOf<Int>(44,1,6,45,22,54),
        listOf<Int>(15,21,23,51,43,85)
    )
    //вычленить из двумерного массива один массив
    val mass = mutableListOf<Int>()
        revenueByWeek.map {
            for (i in it){      //разделение двумерного массива на массивы
                mass.add(i)
            }
        }
    val average = mass.average()
    //println(average)

    //как сделать по-другому - через функцию flatMap
    // берем коллекцию revenueByWeek и вызываем метод flatMap {it} или flatten() - эти два метода равнозначны

    val mass1 = revenueByWeek.flatMap { it }
    val average1 = mass1.average()
    //println(average1)

    val mass2 = revenueByWeek.flatten()
    val average2 = mass2.average()
    //println(average2)


    //Следующее задание
    //создать коллекцию файлов, которые хранят различные данные, например, возраст пользователей
    //как создать коллекцию map и положить туда данные

    val data = mapOf<String, List<Int>>(
        "file1" to listOf<Int>(12, 44, 32, 89),     //вся строка - это it, чтобы взять только значения list - добавить .value
        "file2" to listOf<Int>(22, 11, 74, 31),
        "file3" to listOf<Int>(55, 16, 9, 11),
        "file4" to listOf<Int>(43, 55, 93, 26)
    //для создания объекта: используется объект типа Pair
        //,Pair("file5", listOf(1, 3, 4, 2))
    )

    val data_val = data.flatMap { it.value }
    val aver = data_val.average()
    //println(aver)     //результат =  38.9375

    //Что делает метод flatMap - создает одну коллекцию из нескольких
    //в примере выше в теле метода flatMap указывается it.value
    //it - означает, что берется каждая из коллекций полностью (пример - "file1" to listOf<Int>(12, 44, 32, 89))
    //при добавлении value - берется только listOf<Int>(12, 44, 32, 89)
    //по итогу получаем одну большую коллекцию, состоящую из четырех листов (см пример выше)

    //Что делает метод map - создает коллекцию коллекций
    //то есть на выходе будет коллекциия, состоящая из коллекций
    //а flatMap создаст одну большую коллекцию

    //


}