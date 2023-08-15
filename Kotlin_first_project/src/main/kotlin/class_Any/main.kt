package class_Any

fun main () {
    val user1 = Test_any("Yar", "L", 30)
    val user2 = Test_any("Yar", "La", 310)

    println(user1 == user2)
}


/*
1) При вызове функции println для переменной user1 в консоли выводится адрес объекта в куче.
   Пример: class_Any.Test_any@7adf9f5f

*/


