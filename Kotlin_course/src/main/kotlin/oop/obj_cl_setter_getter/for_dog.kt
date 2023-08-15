package oop.obj_cl_setter_getter

fun main() {
    var dog = Dog()

    dog.age = -13
    dog.weight = -50
    dog.name = "null"

    println("Age: ${dog.age}, Weight: ${dog.weight}, Name: ${dog.name}")
}