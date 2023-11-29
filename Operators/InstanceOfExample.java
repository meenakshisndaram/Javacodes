package Operators;

import java.util.ArrayList;

class Animal {
    // Some properties and methods of the Animal class
}

class Dog extends Animal {
    // Additional properties and methods specific to Dog
}

class Cat extends Animal {
    // Additional properties and methods specific to Cat
}

public class InstanceOfExample {
    public static void main(String[] args) {
        // Creating an ArrayList with Animal objects
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());

        // Checking the type of each element in the ArrayList
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("It's a Dog!");
            } else if (animal instanceof Cat) {
                System.out.println("It's a Cat!");
            } else {
                System.out.println("It's another type of Animal.");
            }
        }
    }
}
