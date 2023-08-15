package oop.methods

import javax.swing.text.StyledEditorKit.BoldAction

class Cat (val name: String, var year: Int, val weight: Float = 0f) {
    fun printInfoCat () {
        println("Name: $name, Year: $year, Weight: $weight")
    }

    //fun catIsOLd () = year >=12

    //чтобы решить создавать в классе метод или свойство, то нужно понять - этот метод что-то делает или показывает какое-то
    //свойство объекта. Если что-то делает, то нужно создавать метод, если не делает - то свойство.
    //Например - создание свойства:

    val isOldCat = year >= 12

    //если значение этой переменной зависит от других переменных класса, то нужно переопределить геттер, чтобы он в
    //любой момент времени возвращал правильное значение. Для этого:

    val isOldCat1: Boolean
        get() = year >=12
}