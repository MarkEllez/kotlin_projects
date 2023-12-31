package Parametrization

class Case<T, E>(var item: T, var item2: E): Storage<T> {
    override fun get(): T {
        return  item
    }

    override fun add(item: T) {
        this.item = item
    }

    override fun toString(): String {
        return "Case(item=$item, item2=$item2)"
    }


}




/*
Если класс наследуется от параметризованного интерфейса,
 то этот класс тоже должен обозначаться с параметризованным типом - таким образом мы объявляем тип Т

Функция add
В функции add ключевое слово this.item - это обращение к переменной класса Case
просто item - это значение, которое пришло из параметра функции add.
То есть получается, что в переменную item класса Case мы записываем значение item, пришедшего в параметрах функции add.

В классе можно указывать несколько дженериков, и они необязательно должны наследоваться от интерфейса,
их можно создавать прямо в классе.

Дженерик - это по сути неопределенный тип, который может определяться и для конструктора класса,
и для функций, существующих отдельно от класса

Пример: fun <T> funct (item: T){
 */