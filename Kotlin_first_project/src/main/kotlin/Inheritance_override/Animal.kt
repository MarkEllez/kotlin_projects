package Inheritance_override

open class Animal (val name: String, val voice: String) {
    open fun sleep(){
        println("$name is sleeping!")
    }

    open fun voiceSound(){
        println(voice)
    }
}




//Чтобы сделать данный класс суперклассом - необходимо перед классом поставить open
//Чтобы методы в данном суперклассе можно было переопределить в классах-наследниках нужно перед ними поставить open