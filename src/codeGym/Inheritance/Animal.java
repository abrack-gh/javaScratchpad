package codeGym.Inheritance;

public class Animal {

    public static void printAll(){

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.hasLegs();
        dog.sayWoof();

    }
    public static void main(String[] args)
    {
        printAll();
    }
}
