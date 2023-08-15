package oop.anonym_class

import functional_programming.name

class Car(override var name: String = "Машина"): Transport (name) {
    override fun drive() {

    }

    fun startEngine (): Boolean {
        val start: Boolean = true
        if (start){
            return true
        }
        return false
    }

}

//переменную в параметрах класса тоже можно переопределять с пом override
//поэтому в род классе нужно пометить эту переменную как open

//в вызывающем классе после указания отличного от дефолтного значения данной переменной выходит ошибка, так
//как она приведена к типу Transport, то есть к родительскому классу.
//Для того чтобы убрать ошибку, необходимо в вызывающем классе проверить является ли эта переменная
//типом класса-наследника if(i is Car). Пример:
/* if (car is Car){
        car.name = "Mazda"
    }
    */