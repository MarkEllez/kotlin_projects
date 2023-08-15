package oop.abstract_class_interface.homework

import oop.anonym_class.homework.Sportsman
import oop.anonym_class.homework.Vodonos
/*
fun main() {
    val sportsman = Sportsman()
    sportsman.callVodonos(object: Vodonos {
        override fun bringWater() {
            println("Уже тащу")
        }
    })
}

 */

fun main() {
    val sportsman = Sportsman()
    sportsman.callVodonos{ println("Water is on") }
}