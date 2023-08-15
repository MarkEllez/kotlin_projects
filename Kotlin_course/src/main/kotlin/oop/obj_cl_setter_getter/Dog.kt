package oop.obj_cl_setter_getter

import java.util.*

//Homework
//создать класс Собака с полями Кличка, возраст и вес
//возраст и вес нельзя установить меньше 0
//при получении клички должна возвращаться строка, которая начинаетс с заглавной буквы

class Dog {
    var name = ""
        get() = field.toLowerCase().capitalize()

   /*     get() {
           return if (field == "" || field == null){
                ""
            } else {
               field?.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
            }
        }

    */


    var age: Int = 0
        set(value) {
            if (value >= 0){
                field = value
            } else {
                field = 0
            }
        }

    var weight: Int = 0
        set(value) {
            if (value >= 0){
                field = value
            } else {
                field = 0
            }
        }


}