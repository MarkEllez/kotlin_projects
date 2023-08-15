package oop.equals_hash_code_java;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int numberOfHouse;

    public Address(String city, String street, int numberOfHouse) {
        this.city = city;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public boolean equals(Object o) {
        //если переменные ссылаются на один и тот же объект, то объекты будут равны
        if (this == o){
            return true;
        }
        //после переопределения hash_code нужно добавить условие
        if (hashCode() != o.hashCode()){
            return false;
        }
        Address address = (Address) o;  //объект о приводим к типу Address, чтобы у объекта о были те же поля и методы, что у класса Address
        return this.city.equals(address.city) && this.street.equals(address.street) && this.numberOfHouse == address.numberOfHouse;

        //возле numberOfHouse ставим ==, так как примитивные типы как и ссылки хранятся в стеке
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, numberOfHouse);
    }
}
