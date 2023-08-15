package functional_programming

fun main() {
    val numbers = (0..1000).toList()

    //метод take - берет из последовательности определенное количество элементов
    val taken = numbers.take(30)            //показывает первые 30 элементов
    val takenLast = numbers.takeLast(11)    //показывает последние 11 элементов
    for (i in taken){
    //   println(i)
    }

    //метод drop - убирает из последовательности определенное количество элементов
    val dropped = numbers.drop(30)      //убирает первые 30 элементов
    val droppedLast = numbers.dropLast(12)      //убирает последние 12 элементов

    //ЛЕНИВАЯ ИНИЦИАЛИЗАЦИЯ
    // элемент инициализируется только в тот момент, когда он используется где-то в коде
/*
    val genSec =  generateSequence (0) {
      //  println("Сгенерировано: ${it + 1}")
        it + 1
    }
    val seq = genSec.take(10)
    for (i in seq){
      //  println(i)
    }
*/
    //можно также создавать последовательность из строчных значений (char) - для этого в seed указать 'a' или другой
    //буквенный символ

    //HOMEWORK
// сгенерировать бесконечную последовательность строк (Сотрудник №1, Сотрудник №2)
    //Вывести на экран первые 100 элементов

    val infStr = generateSequence("Сотрудник №1"){
        val index = it.substring(11).toInt()
        "Сотрудник №${index + 1}"

    }
    val ss = infStr.take(100)
    for (i in ss) {
        println(i)
    }

}