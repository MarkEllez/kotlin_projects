package oop.inheritance.homework

import kotlin.jvm.internal.Intrinsics.Kotlin

fun main() {
    var workers: MutableList<Worker> = mutableListOf<Worker>()
        workers.add(Worker("Leonid", 25))
        workers.add(Worker("Artem", 22))
        workers.add(Worker("Vasya", 55))
        workers.add(Developer("Yaroslav", 30, "Kotlin"))
        workers.add(Developer("Viktor", 32, "Java"))


    for (i in workers){
         i.work()
    }




}



