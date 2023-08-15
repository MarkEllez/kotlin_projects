package syntax

fun main() {
  // arOfNulls()
   // downTo()
   // ind()
    homeWork()
}


fun arOfNulls (){
    var array = arrayOfNulls<Int?>(101)
    for (i in 0 until array.size){
        println(i)
    }

}

//until используется вместо array.size - 1
//arrayOfNulls - Возвращает массив объектов заданного типа заданного размера, который проинициализирован null значениями
/*
val array = arrayOfNulls(3) // [null, null, null]
 равносильно
 arrayOf(null, null, null)
 */



fun downTo(){
    var array2 = arrayOfNulls<Int>(11)
    for (a in array2.size downTo 0)
        println(a)
}

//downTo позволяет сделать цикл от большего к меньшему значению


fun ind (){
    val array3 = arrayOfNulls<Int>(101)
    for (i in 0 until array3.size){         //присваиваем к индексу массива значение в массиве
        array3[i] = i
    }
    for ((index, i) in array3.withIndex()){
        array3[index] = i?.times(2)             //умножаем каждый элемент массива на 2
    }
    for (i in array3){                          // выводим каждое значение i из массива array3
        println(i)
    }
}

/*
 Отдельно выполнить какое-либо действие со значением в индексе мы не можем, но можем ввести в цикл доп переменную
 типа index, с пом которой можно будет производить действия со значениями в индексе (index, i), но для этого нужно
 добавить метод withIndex() к переменной массива array3.withIndex()

 */


fun homeWork(){
    val ar = arrayOfNulls<Int>(301)
    for ((index, i) in (300..600).withIndex()){
        ar[index] = i                   // индекс от 0 до 300, переменная i от 300 до 600, то есть
                                        // ar[0] = 300
    }

    for (i in ar.size -1 downTo 0 step 5)
        println(ar[i])



}