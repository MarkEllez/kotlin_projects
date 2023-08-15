package oop.methods

import java.util.Calendar

//класс Работник
//обязательные поля в конструкторе: имя, должность, год устройства на работу
//создать метод, который выводит на экран сроку "Работаю"
//добавить свойство Стаж = текущий год - год устройства на работу
//в файле Main создать extension-функцию, которая выводит всю информацию о работнике

class hw_worker (var name: String, var title: String, var year: Int) {

    fun work () {
        println("Work $name in title of $title from $year year")
    }

    val work_experience: Int = Calendar.getInstance().get(Calendar.YEAR ) - year
}