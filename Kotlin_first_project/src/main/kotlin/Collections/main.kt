package Collections

//List
/*
fun main(){
    var el1 = listOf("Apple", "Peach")
}
 */



/*
Чтобы использовать Collection List нужно вызвать listOf
Элементы коллекции List нельзя изменить. НО чтобы можно было изменить - нужно использовать mutableListOf вместо listOf
 */

//Map

/*
fun main () {
    var massive = mapOf(12345 to "qwer", 111 to "3234", 12345 to "qq")

    println(massive[12345])
    massive.
}

 */

/*
Коллекция Map нужна для соответствия значений друг другу.
Можно указывать null
В квадратных скобках можно указывать только ключ, а не его значение
Если ключи совпадают, то в результатах указывается значение последнего ключа
Функция entries выводит ключ=значение для всез ключей в массиве
 */

//Set

fun main (){
    val setExanple = setOf<String>("apple", "banana", "apple")
    println(setExanple)
}

/*
This is collection, where is no any duplicates.
Duplicate will not be printed
Function "contains" means that this element contains in this massive
Function "union" - all elements from two massives will be printed without duplicates
Function intersect – – All matching elements from two massives will be printed without duplicates
 */