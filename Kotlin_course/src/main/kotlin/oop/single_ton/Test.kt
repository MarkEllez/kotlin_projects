package oop.single_ton

class Test {
    fun insertFromTest (string: String) {
       // Database.getInstance().insertData(string)  //в случае создания класса Database
        Database.insertData(string)         //в случае создания object Database

    }
}


//как использовать объект другого класса в не вызывающем классе