package oop.abstract_class_interface

fun main() {
    var workers: MutableList<Worker> = mutableListOf<Worker>()
        workers.add(Seller("Leonid", 25))
        workers.add(Seller("Artem", 22))
        workers.add(Seller("Vasya", 55))
        workers.add(Developer("Yaroslav", 30, "Kotlin"))
        workers.add(Developer("Viktor", 32, "Java"))
        workers.add(Director("Zeleboba", 50))

    //так как Director не реализует интерфейс Cleaner, то при приведении всех объектов к типу Cleaner
    //на этом объекте появляется ошибка
    //Чтобы ошибка не возникала нужно отфильтровать коллекцию Worker таким образом, чтобы высвечивались
    //только те объекты, которые реализуют интерфейс Сleaner (filter), а затем привести их к типу Cleaner (map {it as Cleaner})

        val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
    for (i in cleaners){
        i.clean()
    }

    /*
        for (i in workers){
             i.work()

            if (i is Cleaner){
                i.clean()               //smartCast
            }

        i as Cleaner
        i.clean()
    }

     */

}


//что такое SmartCast
//это умное приведение типов.
//Например, в данном примере, класс Seller и Developer наследуются от абстрактного класса Worker,
// а также от интерфейса Cleaner. Но вызывать метод clean(), который переопределяется из интерфейса Cleaner не получится.
//Для этого нужно в условии if() указать, что если объект реализует интерфейс Cleaner, то, например, у этого объекта вызывается
// такой-то метод (делается это с помощью ключ слова is)

//Чтобы явно привести объект к нужному типу нужно после объекта поставить ключ слово as:
//i as Cleaner


// Что такое is - оператор, с помощью которого проверяется - является ли объект типом какого-то класса
//Что такое as - оператор для явного преобразования объекта к определенному типу



