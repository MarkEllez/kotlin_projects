package functional_programming

//как создать коллекцию строк
//как создать рандомный массив с именами, телефоном, номерами, числами:

fun main() {
    val numbers = mutableListOf<Long>()
    val namess = mutableListOf<String>()
    for (i in 0..1000){
        namess.add("Name$i")
        numbers.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }

    //как объединить два массива в один (функция zip) -
    // в примере ниже запихнули массив numbers в массив names

    val users = namess.zip(numbers)
    for (i in users){
      //  println("Name: ${i.first} Phone: ${i.second}")
    }

    //task 1 - Создать массив Имя-Фамилия (разбить его на два массива) и затем объединить через zip
    //создание массива
    val fname_lname = mutableListOf<String>()
    for (i in 0..1000){
         fname_lname.add("Name$i LastName$i")
    }
    //разбиение на два массива
    val names = fname_lname.map{it.substringBefore(" ")}
    val lastNames = fname_lname.map { it.substringAfter(" ") }

    //объединение двух массивов
    val common = names.zip(lastNames)
    for (i in common){
        println("Name: ${i.first} LastName: ${i.second}")
    }







}


/*
    val numb = generateSequence("+7-911-000-0001"){
        val nn = it.substring(12).toInt()
        "+7-911-000-${nn+1001}"
    }
    val numbers = numb.take(1000)
    for (i in numbers){
       // println(i)
    }


    val n = generateSequence {
        val na = Math.random().toString()
        "$na + 1"
    }
    val names = n.take(1000)
    for (i in names){
        println(i)
    }
*/