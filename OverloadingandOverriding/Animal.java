package OverloadingandOverriding;

//Method overriding
public class Animal {
    // Method in the base class
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound method in the derived class
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
}class OverridingExample {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();

        genericAnimal.makeSound(); // Calls the makeSound method in the OverloadingandOverriding.Animal class
        dog.makeSound();           // Calls the overridden makeSound method in the OverloadingandOverriding.Dog class
    }}


//Example 2
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    // Overriding the start method in the Car class
    @Override
    public void start() {
        // Call the start method of the parent class using super
        super.start();
        System.out.println("Car is starting...");
    }
}

 class OverridingExampleWithSuper {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car();

        // Call the start method on the Car instance
        myCar.start();
    }
}

//Example 3

class Animated{
    public Object nun(){
        System.out.println("It is a good movie");
    return null;
    }
}
class Naruto extends  Animated{
    public  String nun(){
    System.out.println("Its fully a animated movie");
    return "";
    }}

class Movies{
    public static void main(String[] args) {
        Animated an=new Naruto();
        an.nun();
    }
}


//Example 4
class India{
    private String virat(){
        System.out.println("He is the man of  beating the Sachines records");
        return  "";
    }
}
class Indian extends India{
     public  void Rohit(){
        System.out.println("He is the opener of our indian Cricket team");
    }}
class Indianteam{
    public static void main(String[] args) {
        India i=new Indian();
        //i.Rohit(); will be of a error
        //i.virat(); will be of a error

    }
}