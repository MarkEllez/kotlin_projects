package oop.anonym_class

import functional_programming.name

fun main() {

  /*
    val car: Transport = Car()
    val bicycle: Transport = Bicycle()


//первый способ замены значения переменной car

    if (car is Car){
        car.name = "Mazda"
    }
    println(car.name)
 */

//второй способ
    /*
    if(car !is Car) return
    car.name = "Mazda"
    println(car.name)
    */

//третий способ
    /*
    if (car is Car && car.startEngine())
        car.name = "Mazda"
        println(car.name)

     */

    travel(object : Transport("Автобус") {
        override fun drive() {
            println("Автобус едет...")
        }
    })


}

fun travel (transport: Transport){
    transport.drive()
}

//как создать анонимный класс
/*
Вызывается метод, внутри него ключ слово object (это объект анонимного класса)
После прописывается тип объекта и сразу в фигурных скобках реализация
*/


//для чего используется анонимный класс
/*Предположим, что мы еще не создавали никакой класс, кроме вызывающего, а использовать объект класса
нужно всего один раз. Тогда нет необходимости создавать обычный класс, объект для него и вызывать с ним метод.

Для этого создается анонимный класс. На примере выше создается объект анонимного класса прямо внутри метода.
*/