package oop.enum_class

import java.util.jar.JarEntry

fun main() {
  /*
   var result = monthSeason("January")
    println(result)
   */

    var result1 = monthSeason1(Month.JULY)
    println(result1)
}

//создание функции, если не использовать enum class
/*
fun monthSeason (month: String): String {
    var season = when (month) {
        "January" -> "Winter"
        else -> "nothing"
    }
    return season

}
 */

//функция с использованием enum класса
fun monthSeason1 (month: Month): Season{
    var season: Season = when (month){
        Month.DECEMBER -> Season.WINTER
        Month.JANUARY -> Season.WINTER
        Month.FEBRUARY -> Season.WINTER
        Month.MARCH -> Season.SPRING
        Month.APRIL -> Season.SPRING
        Month.MAY -> Season.SPRING
        Month.JUNE -> Season.SUMMER
        Month.JULY -> Season.SUMMER
        Month.AUGUST -> Season.SUMMER
        Month.SEPTEMBER -> Season.AUTUMN
        Month.OCTOBER -> Season.AUTUMN
        Month.NOVEMBER -> Season.AUTUMN
    }
    return season
}
