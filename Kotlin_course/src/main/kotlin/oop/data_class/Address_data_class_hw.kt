package oop.data_class

class Address_data_class_hw(var city: String, var street: String, var numberOfHouse: Int) {

    //переопределить hash_code и equals()
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address_data_class_hw

        if (city != other.city) return false
        if (street != other.street) return false
        if (numberOfHouse != other.numberOfHouse) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + numberOfHouse
        return result
    }

    //переопределить метод toString()
    override fun toString(): String {
        return "Address_data_class_hw(city='$city', street='$street', numberOfHouse=$numberOfHouse)"
    }


    //переопределить метод copy()
    fun copy(city: String = this.city, street: String = this.street, numberOfHouse: Int = this.numberOfHouse)
    : Address_data_class_hw {

        return Address_data_class_hw(city, street, numberOfHouse)
    }

    //переопределить components для деструктора
    operator fun component1 () = city
    operator fun component2 () = street
    operator fun component3 () = numberOfHouse




}