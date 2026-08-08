package oops.polymorphism;

public class RunTimePolymorphismDemo {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal = new Animal();
        animal1.sound();
        animal2.sound();
        animal.sound();

    }
}
