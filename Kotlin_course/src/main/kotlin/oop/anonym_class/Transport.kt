package oop.anonym_class

abstract class Transport(open val name: String) {
    abstract fun drive()
}

//переменная val - неизменяема, так как указана как val - это значит у нее есть геттеры, но нет сеттеров