package oop.single_ton

fun main() {

    //В случае создания object Database
    val db = Database
    db.insertData("1")
    db.insertData("2")

    val test = Test()
    test.insertFromTest("3")
    test.insertFromTest("4")

    for (str in db.data){
        println(str)
    }

/* В случае создания класса Database
    val db = Database.getInstance()         //создаем объект
    db.insertData("1")
    db.insertData("2")


    val test = Test()
    test.insertFromTest("3")
    test.insertFromTest("4")


    for (str in db.data){
        println(str)
    }

 */





}