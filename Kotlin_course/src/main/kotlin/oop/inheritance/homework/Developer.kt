package oop.inheritance.homework

class Developer(name: String, age: Int, var progLang: String) : Worker(name, age) {

    override fun work() {
        println("Пишу код на $progLang")
    }
}