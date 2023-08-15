package oop.abstract_class_interface

class Seller(name: String, age: Int) : Worker(name, age), Cleaner {
    override fun work() {
        println("Продаю товар")
    }

    override fun clean() {
        println("Убираюсь вонючей тряпкой")
    }
}