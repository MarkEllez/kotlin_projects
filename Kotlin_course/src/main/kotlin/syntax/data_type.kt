
private var name1: String? = "q"
private var name2: String? = "qw"
private var name3: String? = "qwe"



fun main() {
    var result: Int?
    var result1 = name1?.length?:0
    var result2 = name2?.length?:0
    var result3 = name3?.length?:0

    result = result1+result2+result3
    println(result)
}





// Все типы в kotlin - non-nullable
// В Kotlin нет примитивных типов данных, они являются классами (как в java оболочки типов)

//For specifying null as value for data type - it is needed to write the question mark after data type (private var name: String? = null)
//and after the name of variable write two exclamation marks
/*
fun main() {
    println(name!!.length)
}
 */

//if write the questions mark after variable - println(name?.length) это означает, что если значение переменной name
//не равно null, то выводим длину сроки, если равна null - то выводим null


//Если написать  var length = name?.length?:0 - это будет означать, что если name будет не null, то выведется длина строки,
//если null - то выведется 0.
// То есть ?: - это элвис, означающий употребление значения по умолчанию