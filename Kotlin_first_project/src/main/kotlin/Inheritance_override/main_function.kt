package Inheritance_override

fun main(){

    val cat_1 = Cat(name = "Persik", voice = "Meow")

    cat_1.sleep()
    cat_1.voiceSound()
}


/*
Модификаторы доступа:
public - можно иметь доступ откуда угодно
private - доступ только из места объявления
protected - доступ как у private + наследники
 */