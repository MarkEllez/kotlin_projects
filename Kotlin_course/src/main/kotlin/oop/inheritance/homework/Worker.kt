package oop.inheritance.homework

open class Worker(var name: String, var age: Int) {

    open fun work() {
        println("Работаю ...")
    }
}