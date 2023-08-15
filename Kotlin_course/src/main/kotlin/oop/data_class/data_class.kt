package oop.data_class

 class data_class(var name: String, var lastName: String, var id: String) {
    /*
      если не указывать класс ключевым словом data, то при создании деструктора будет появляться ошибка
      Чтобы она не возникала - нужно переопределить component в нашем классе data_class

        Чтобы компилятор знал, что это не функции, которые мы создаем сами, а функции, которые требуются для деструктора,
        то нужно перед определением функции указать operator
       * */
   operator fun component1() = name
    operator fun component2() = lastName
    operator fun component3() = id

    fun copy (name: String = this.name, lastName: String = this.lastName, id: String = this.id): data_class {
        return data_class(name, lastName, id)
    }

}