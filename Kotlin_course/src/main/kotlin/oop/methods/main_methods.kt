package oop.methods

import java.util.Calendar
import java.util.Date

fun main() {
    val cat = Cat("Persik", 13, 6f)
   // cat.printInfoCat()
   // println(cat.isOLd())

    val worker = hw_worker("Zalupa", "engineer", 1988)
    worker.printInfoWorker()


}
//если из класса недоступны методы для вызывабщего метода, то нужно создать extension функцию:
//вне вызывающего метода

fun Cat.isOLd() = year >=12

fun hw_worker.printInfoWorker() {
    work()
    println("My current work experience is equal to $work_experience years")
}
