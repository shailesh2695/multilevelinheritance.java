// Base class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Intermediate class
class Mammal extends Animal {
    void walk() {
        System.out.println("Walking...");
    }
}

// Derived class
class Dog extends Mammal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Main class to demonstrate multilevel inheritance
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.walk(); // Inherited from Mammal
        dog.bark(); // Specific to Dog
    }
}
