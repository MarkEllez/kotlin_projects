package oop.static_comp_object

class Calc {
   // fun square (num: Int) = num * num

    companion object {
        const val pi = 3.14
        fun square (num: Int) = num * num
        fun lengthOfCircle (radius: Int) = radius * pi * 2
    }


}


//Почему val не является константой?
/*
Так как переменная val по умолчанию создается с модификатором доступа private
И у нее можно переопределить метод get (геттер)

Чтобы val была константой - нужно перед ней поставить ключ слово const
*/