package oop

import oop.obj_cl_setter_getter.first_lesson

fun main() {
    val user = first_lesson()       //создали объект класса first_lesson

    //вывести значения возраста и имени для объекта user
/*
    user.setAge(15)
    user.setName("Zalupa")
 */

   // println("Возраст ${user.getAge()}, Имя: ${user.getName()}")

    //НО в kotlin создавать сеттеры и геттеры не нужно
    //достаточно сослаться на поля при установке значений для объекта:

    user.name = null
    user.age = -15

    println("Age: ${user.age}, Name: ${user.name}")

    //правила инкапсуляции не нарушаются, так как обращение идет не к public полю, а к геттеру

}