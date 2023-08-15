package oop.single_ton


object Database {
    val data = mutableListOf<String>()
    fun insertData (str: String){
        data.add(str)
    }
}


/*
class Database private constructor() {


    val data = mutableListOf<String>()
    fun insertData (str: String) {
        data.add(str)
    }

    companion object {
        var db: Database? = null

        fun getInstance (): Database {              //объект класса
            db?.let {                       //если объект db не равен null, то вернется его значение
               return it
            }

            //если db равен null, то создаем новую ссылочную переменную instance
            val instance = Database()
            db = instance
            return instance
            /*
            if (db == null){
                db = Database()         //условие - если объект существует, то он не создастся
            }
            return db
             */
        }
    }


}


 */

//чтобы можно было пользоваться одним объектом из разных классов, нужно
//в классе (в дан случае Database) запретить создавать объекты
// - для этого нужно сделать класс private (class Database private constructor())

/*
 чтобы получить объект этого класса - нужно создать метод, который возвращает объект
 чтобы обратиться вне класса к этому объекту - нужно этот метод сделать статическим

Но при каждом вызове данного стат метода в вызывающем классе - будет заново создаваться объект данного класса
Поэтому создаем условие c let и задаем новую ссылочную переменную в случае, если объект db = null

Чтобы создать объект в вызывающей функции main - нужно для класса Database вызывать метод getInstance

 */

/*
Альтернативный вариант:

создать не класс Database, а object - см сверху
 */
