package syntax

//Преобразование String в Int
/*
В Java чтобы преобразовать String в Int - нужно было вызвать Integer.parseInt()
В Kotlin достаточно вызвать toInt()
*/

fun main() {
    val k = sum_Tc_1("1", "авыаа")
    println(k)
}

fun sum(a: MutableList<Int>, b: String): Int {
    val numA = a.toString()
    val numC = numA.toInt()
    val numB = b.toInt()

    var result = summ(numC, numB)
    return result

}

//Try-catch
/*
Try-catch является выражением и может возвращать значение. Причем возвращать значение должна как функция try,
так и catch
Пример ниже:
*/


fun sum_Tc (a: String, b: String): Int {
    try {
        var A1 = a.toInt()
        var B1 = b.toInt()
        var result = summ(A1, B1)
        return result
    }catch (e: Exception){
        return 0
    }
}

//но так как и try, и catch должны вовзвращать значение, то можно метод переписать так:

fun sum_Tc_1 (a: String, b: String): Int {
    return try {
        var A1 = a.toInt()
        var B1 = b.toInt()
        var result = summ(A1, B1)
        result
    }catch (e: Exception){
         0
    }
}