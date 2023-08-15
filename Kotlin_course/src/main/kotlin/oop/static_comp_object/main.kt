package oop.static_comp_object

fun main() {
   /*
    val calc = Calc()
    println(calc.square(4))

    */

   // println(Calc.square(5))
  //  println(Calc.lengthOfCircle(4))

    println(MyRandom.randomNumber(1,7))

}

//В Kotlin нет ключ слова static
//Вместо него создается companion_object
//Например, в классе Calc - метод оборачиваем в companion_object и в вызывающем методе не нужно создавать
//объект класса Calc
//И при вызове метода класса Calc в вызывающем методе указываем имя_класса.имя_объекта


//Что такое companion_object
/*
Это объект, который относится к классу, в котором он был объявлен.

Поля companion_object не могут обращаться к полям и методам класса, в котором был создан companion_object

Но будут доступны те поля и методы, которые были созданы внутри companion_object
*/

