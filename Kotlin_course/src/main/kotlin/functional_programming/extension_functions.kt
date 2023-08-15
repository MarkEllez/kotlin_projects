package functional_programming

//extension функции добавляют методы класса - создаем сами

fun main() {

    //пример с int

    val age = 18
/*
    if (ageFunction(age)){
        println("sss")
    }


    if (age.ageFunc()){
        println("ss")
    }
    if (age.isPositive()){
        println("qq")
    }
 */

    val nn = 6
   println(nn.isPrimeNumber())


}

fun ageFunction (age: Int) = age in 12..100     //обычная функция

fun Int.ageFunc() = this in 12..100     //extension функция - добавление метода в класс Int - проверяет диапазон

fun Int.isPositive() = this >=0         //extension функция - добавление метода в класс Int - проверяет на +-

//можно вызывать extension функцию из extension функции
//fun Int.ageFunc() = isPositive() - //при условии, что Int.ageFunc() создается первый раз


//task 1 - создать extension функцию у типа Int, в которой определяется является ли число простым (делиться нацело само на себя
// и на 1 )

fun Int.isPrimeNumber(): Boolean {
    if (this <= 3) return true

    for (i in 2 until this){
        if (this % i == 0) return false
    }
    return true
}


    /*
    for (it in 0..1000){
        for (j in 0..1000){
            if (it % j == 0 && it != j && j != 1){
                println("The number isn't prime")
            }
            else {
                println("The number is prime")
            }
        }
    }

     */

