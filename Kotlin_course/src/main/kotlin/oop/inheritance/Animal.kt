package oop.inheritance

open class Animal (val name: String, val weight: Float, val habitat: String) {
   open fun eat() {
        println("Eat something")
    }

    //все классы и методы в kotlin по умолчанию - final, поэтому от классов нельзя наследоваться и методы переопределять по умолчанию
    //чтобы можно было наследоваться от класса - он должен быть определен как open
    //чтобы можно было наследоваться от метода - он также должен быть определен как open
}