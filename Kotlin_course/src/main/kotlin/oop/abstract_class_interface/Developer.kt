package oop.abstract_class_interface

class Developer(name: String, age: Int, var progLang: String) : Worker(name, age), Cleaner {

    override fun work() {
        println("Пишу код на $progLang")
    }

    override fun clean() {
        println("Убираюсь вонючей тряпкой")
    }
}