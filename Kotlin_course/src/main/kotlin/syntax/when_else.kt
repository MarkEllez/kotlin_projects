package syntax

fun main() {
    var gg = selectSeason(2)
  //  println(gg)

    var water = waterStateIf(33)
 //   println(water)

    var wat = waterStateWhen(101)
   // println(wat)

    var pr = practice(24, true)
    println(pr)

}


fun selectSeason (num: Int): String {
    var indexOfMonth = num

    val season = when (indexOfMonth) {
        1,2,12 -> "Winter"
        in 3..5 -> "Spring"
        in 6..8 -> "Summer"
        else -> "Не найдено"
    }
    return season
}


fun waterStateIf (numb: Int): String{
    var temp = numb
    var state: String

    if (temp <= 0) {
        state = "Solid"
    } else if (temp in 0..99){
        state = "Liquid"
    } else state = "Gas"

    return state

}


fun waterStateWhen (grad: Int): String {
    var temp = grad

    var state =
        when {
            temp <= 0 -> "Solid"
            temp in 0..99 -> "Liquid"
            else -> {"Gas"}
        }
    return state
}


fun practice (tt: Int, w: Boolean): String {
    var t = tt
    var weather = w


    var act =
        when {
            t < 6 || t in 23..24  -> "Sleep"
            t in 6..22 && weather -> "Walk"
            t in 6..22 && !weather -> "Read the book"
            else -> "Write the value again"
        }
    return act

}