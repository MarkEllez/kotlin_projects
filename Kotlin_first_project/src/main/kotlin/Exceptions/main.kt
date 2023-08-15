package Exceptions

import java.lang.ArithmeticException
import java.lang.Exception
import java.util.ArrayList

fun main(){
    var a = 10
    var b = 0

    var numbers = arrayOf(1, 2, 3)

    for (i in 0..5){
        println( )
    }

    try {
        println(a/b)
    }catch (e: ArithmeticException){
        println("Деление на ноль")
    }catch (e: Exception){
        println("Произошла ошибка")
//        e.printStackTrace()
    }finally {

    }

}


/*
1) Все исключения наследуются от класса Exception.
А класс Exception наследуется от класса Throwable.
Throwable реализует интерфейс Serializable.

2) Отличия error и exception
В случае получения exception - мы его можем обработать
В случае возникновения error - продолжить работу программы не получится. И отловить error как exception
с помощью блока try/catch нельзя.

3) printStackTrace() - данная функция распечатывает весь путь программы

4) Блок finally вызовется в любом случае - произошел exception или нет - этот блок вызовется.

5) throw - используется для явной генерации исключения
Можно самим создавать исключение - в виде класса, который наследуется от класса Exception()


 */