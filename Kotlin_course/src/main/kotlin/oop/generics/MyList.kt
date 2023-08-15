package oop.generics

interface MyList {
    fun get(index: Int): String     //получение элементов массива
    fun add(string: String)         //вставка элементов массива
    fun remove(element: String)     //удаление элементов массива
    fun removeAt(index: Int)        //удаление с определенного номера элементов массива
    fun size(): Int                 //получение размера массива
}