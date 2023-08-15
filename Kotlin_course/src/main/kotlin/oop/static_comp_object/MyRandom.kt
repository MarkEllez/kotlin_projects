package oop.static_comp_object

//Homework
/*
1) создать класс MyRandom со статическими методами:
    - возвращает случайное целое число в переданном диапазоне
    - возвращает случайное значение типа Boolean (true или false)
    - возвращает случайный день недели (название)

*/

class MyRandom {

    companion object {
       private const val monday = "Monday"
       private const val tuesday = "Tuesday"
       private const val wednesday = "Wednesday"
       private const val thursday = "Thursday"
       private const val friday = "Friday"
       private const val saturday = "Saturday"
       private const val sunday = "Sunday"
        fun randomNumber (from: Int, to: Int) = (Math.random()*(to - from + 1)).toInt() + from
        fun randomBoolean () = randomNumber(0,1) > 0
        fun randomDay (): String {
             val index = randomNumber(1, 7)
            return when (index) {
                1 -> monday
                2 -> tuesday
                3 -> wednesday
                4 -> thursday
                5 -> friday
                6 -> saturday
                7 -> sunday
                else -> "Залупа"
            }

        }

    }
}