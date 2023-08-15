package oop.generics.homeworkT

interface MyListT<T> {
    fun get (index: Int): T
    fun add (string: T)
    fun remove(element: T)
    fun removeAt(index: Int)
    fun size(): Int
}