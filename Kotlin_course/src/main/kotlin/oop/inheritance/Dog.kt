package oop.inheritance

class Dog(weight: Float) : Animal("Собака", weight, "Суша") {
    override fun eat() {
        println("Eat the bone")
    }

    //чтобы наследовать метод от родительского класса, нужно дописать перед ним ключ слово override
}