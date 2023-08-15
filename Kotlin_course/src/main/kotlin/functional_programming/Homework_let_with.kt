package functional_programming

//HOMEWORK
//1) за пределами метода main создать nullable array list<Int>
//2) с помощью функции with (внутри main()) заполнить коллекцию 1000 случайными значениями
//3) вывести на экран первые 100 четных чисел коллекции with
//4) при возникновении ошибок в случае нуллабельности - использовать let


val array: MutableList<Int>? = mutableListOf()

fun main() {

    array?.let {
        with(it){
            for (i in 0 until 1000){
                this?.add((Math.random()*1000).toInt())
            }
            val result = filter { it % 2 ==0 }.take(100)
            for (i in result){
                println(i)
            }

        }
    }

}