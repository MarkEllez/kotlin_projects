package oop.equals_hash_code_java;

public class execution {
    public static void main(String[] args) {
        Address address1 = new Address("Moscow", "qqq", 150);
        Address address2 = new Address("Moscow", "qqq", 150);

        // address1 и address2 - это ссылки, которые ссылаются на два разных объекта ,которые лежат в куче

        Address address3 = address2;

        //address3 - это ссылка на тот же объект, на который ссылается ссылка address2

        if (address2.equals(address1)){
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }

        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());

        //Когда сравниваем через знак ==, то сравнивается ссылаются ли данные переменные на один и тот же объект
        //Чтобы сравнить значения в этих объектах, нужно использовать equals() - но его нужно переопределить в классе Address


        //hash_code
        //Правила:
        //hash_code имеет типа Int - а так как значения с типом Int могут быть только в количестве 2млрд, то если
        //hash_code совпадет, то не значит, что объекты с одинаквоым hash_code будут равны. Отсюда два правила:

        //1) если hash_code у двух объектов разный, то объекты точно разные
        //2) если hash_code у двух объектов одинаковый, то объекты все равно могут отличаться

        //3) если переопределили equals(), то нужно переопределить и hash_code()
        // , чтобы значения hash_code зависили от полей объектов

        //hash_code  у типа Int совпадает с самим значением int, емли значение int = 10, то и hash_code у него будет 10

    }
}
