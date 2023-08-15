package oop.generics.homeworkT

import java.lang.IndexOutOfBoundsException

class MyClassT<T>: MyListT<T> {

    var size = 0
    var arrayT = arrayOfNulls<Any>(10)


    //как написать функцию listOf()
    fun<E> myListOf(vararg elements: E): MyClassT<E>{
        val list = MyClassT<E>()
        for (e in elements){
            list.add(e)
        }
        return list
    }



    override fun get(index: Int): T {
        for (index in 0 until arrayT.size){
            arrayT[index]?.let {
                it as T
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(string: T) {
        if (size >= arrayT.size) {
            arrayT = arrayT.copyOf(arrayT.size*2)
        }
        arrayT[size] = string
        size++
    }

    override fun remove(element: T) {
        for ((index, string) in arrayT.withIndex()){
            if (string == element){
                removeAt(index)
                return
            }
        }
    }

    override fun removeAt(index: Int) {
        if (index in 0 until size) {
            for (i in index until arrayT.size - 1) {
                arrayT[i] = arrayT[i + 1]
            }
            size--
        } else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun size(): Int {
        return size
    }
}