package oop.anonym_class.homework

import functional_programming.name

class Sportsman {
    fun callVodonos (name : Vodonos) {
        name.bringWater()
    }

    fun callVodonos (kozelBringWater: () -> Unit) {
        kozelBringWater()
    }

}


//Если все, что нужно от метода - это вызвать функцию, которую ему передали, то нет смысла делать это с помощью интерфейса
//или абстрактного класса - можно использовать функции высшего порядка - как в примере выше