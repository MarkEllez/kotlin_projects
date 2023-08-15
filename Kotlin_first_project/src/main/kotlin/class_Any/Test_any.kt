package class_Any

class Test_any(var firstName: String, var lastName: String, var age: Int): Any() {

    override fun toString(): String {
        return "User =  FirstName: $firstName, lastName: $lastName, age: $age"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true                     // === сравнение ссылок на объекты в куче
        if (javaClass != other?.javaClass) return false     //сравнение, что сравниваемые объекты в одинаковых классах

        other as Test_any                                   //приведение переменной other к типу Test_any

        if (firstName != other.firstName) return false

        return true
    }

    override fun hashCode(): Int {
        return firstName.hashCode()
    }


    /*
        override fun equals(other: Any?): Boolean {
            if (other is Test_any){
                return firstName == other.firstName
            }
            else return false
        }

     */



}


//Все классы неявным образом наследуются от класса Any - наследование от этого класса можно явно не указывать
//Класс Any содержит в себе методы toString, hashCode, equals - поэтому классы-наследники могут переопределять эти методы

/*
1) метод toString() - говорит нам как объект класса должен преобразовываться в строку
Он вызывается по дефолту, когда мы пытаемся передать печать объекта в консоль. Поэтому необязательно его вызывать явно.

Если в классе (где определяется конструктор) переопределить метод toString, то можно вывести на консоль представление объета
так как хотим

2) метод equals() - сравнивает два объекта между собой - перебирает каждое поле объекта и сравнивает их поочередно
Например,
val user1 = Test_any("Yar", "L", 30)
val user2 = Test_any("Yar", "L", 30)

println(user1.equals(user2)) - результатом будет true, так как все поля в данных объектах одинаковы

В случае если нужно сравнить не все поля объекта, а, например, какое-то конкретное, то нужно в классе (не в вызывающем)
переопределить метод equals таким образом:

override fun equals(other: Any?): Boolean{
    if(other is className){
        return comparedField == other.compareField
    }
    return false
}

В вызывающем классе такая конструкция:

println(objectName1.equals(objectName2))

В примере переопределения метода equals в if(other is className) определяется относится ли объект, указанный в параметре
equals() к типу указанного класса.
Далее в return comparedField == other.compareField сравнивается значение параметра объекта comparedField с параметром
второго объекта, который приходит в метод equals в параметрах (то есть в скобках). Если равны, то возвращается true, если
нет, то false.

В дефолтной реализации переопределения метода equals() присутствует сравнение === - это означает сравнение ссылок на объекты
(ссылки на области в куче, то есть на адреса объектов в куче)

3) метод hash_code - нужен для преобразования объектов в число для дальнейшего более удобного их сравнения
Если в классе переопределяется equals, то и метод hashCode тоже должен переопределяться


*/




