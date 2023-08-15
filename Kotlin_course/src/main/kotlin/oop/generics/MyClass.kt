package oop.generics

import functional_programming.array
import java.lang.IndexOutOfBoundsException
import java.util.Arrays

class MyClass: MyList {

    //нужно создать свой собственный arrayList
    //внутри arrayList используется обычный массив, у которого изначально 10 элементов
    //если добавляю 11-ый элемент, то создается новый массив размером 20 элементов
    //и уже в новый массив добавляется новый элемент

    var array = arrayOfNulls<String>(10)
    var size = 0


    override fun get(index: Int): String {
        if (index in 0 until size){
            array[index]?.let {
                return it
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(string: String) {
        //если количество вставляемых элементов превысило размер массива, то копируем этот массив в новый массив, размер которого
        //в два раза больше первого массива (функция copyOf())
        if (size >= array.size){
            array = array.copyOf(array.size * 2)
        }

        //после каждой вставки значения типа String в массив - его размер увеличивается на 1
        array[size] = string
        size++
    }

    override fun remove(element: String) {
        //нужно удалить строку в массиве
        //сначала проходим по всем элементам в массиве, найти строку
        //если строка равна элементу (string == element) узнаем индекс строки, и удаляем строку по индексу с помощью метода removeAt

        for ((index, string) in array.withIndex()){
            if (string == element){
                removeAt(index)
                return          //т.к. дальнейшие проверки не нужны - выходим из метода с пом ключ слова return
            }
        }
    }

    override fun removeAt(index: Int) {
        //как происходит удаление по индексу
        //Например, хотим удалить элемент с индексом 6, для этого сначала пройдемся по всем элементам массива
        //затем удалим элемент с индексом 6 -> далее элементу с индексом 6 присвоим значение элемента с индексом 7
        //то есть значение, которое было на месте индекса 7 станет на месте значения с индексом 6
        //ставим size - 1, так как при присвоении значения элементу с индексом 9 элемента с индексом 10 произойдет ошибка
        //так как индекса 10 нет в массиве
        //размер массива уменьшить на 1
        if (index in 0 until size) {
            for (i in index until size - 1) {
                array[i] = array[i + 1]
            }
            size--
        }else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun size(): Int {
        return size
    }
}