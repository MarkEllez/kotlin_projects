package Inheritance_override

class Cat(name: String, voice: String): Animal(name, voice) {
    //переопределение метода sleep() из суперкласса Animal
    override fun sleep() {
        println("here you can write everything")
    }
}


/*
1) чтобы данный класс-наследник мог наследовать суперкласс Animal нужно после определения класса и его параметров
поставить : имя_суперкласса(параметр_1, параметр_2)

2) в конструкторе класса Cat нужно убрать val

3) чтобы переопределить метод из суперкласса Animal нужно перед ним поставить override
 */