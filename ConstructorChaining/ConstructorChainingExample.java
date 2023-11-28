package ConstructorChaining;

// Parent class
class Animal {
    private String name;

    // Parent class constructor with one parameter
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor with one parameter called. Name: " + this.name);
    }

    // Parent class default constructor (no parameters)
    public Animal() {
        this("DefaultAnimal");  // Calls the one-parameter constructor with a default name
        System.out.println("Animal default constructor called.");
    }
}

// Child class extending the parent class
//The only modifier that Applicable for the constructors are public,private,protected & default
class Dog extends Animal {
    private int age;

    // Child class constructor with two parameters
    public Dog(String name, int age) {
        super(name);  // Calls the one-parameter constructor of the parent class
        this.age = age;
        System.out.println("Dog constructor with two parameters called. Age: " + this.age);
    }

    // Child class constructor with three parameters
    public Dog(String name, int age, String breed) {
        this(name, age);  // Calls the two-parameter constructor of the same class
        System.out.println("Dog constructor with three parameters called. Breed: " + breed);
    }
}

public class ConstructorChainingExample {
    public static void main(String[] args) {
        // Create an instance of the Dog class using different constructors
        Dog myDog1 = new Dog("Buddy", 3);
        System.out.println();

        Dog myDog2 = new Dog("Max", 5, "Golden Retriever");
        System.out.println();
    }
}

class constructor{
    int a=0; //It is a instance variable so the every object of the class will take its own instance
    constructor(){
        a++;
    }

    public static void main(String[] args) {
        constructor s=new constructor();
        constructor s2=new constructor();
        System.out.println(s2.a);     // output :1
    }

}

class constructor2
{ static  int  a=0; //It is a static variable
    constructor2(){
        a++;}
    public static void main(String[] args) {
        constructor2 s=new constructor2();
        constructor2 s2=new constructor2();
        System.out.println(s2.a);     // output :2
    }}
class initilizeblocks{
    static  int s=0;
    {
        System.out.println("Initilization blocks called");
        s++;
    }
    initilizeblocks(){
        this(90);
        s++;}
    initilizeblocks(int k){
        System.out.println("Constructor with the int argument called");
        s++;
    }public static void main(String[] args) {
     initilizeblocks ini=new initilizeblocks();
     System.out.println("no of objects created " + s);   //output:3
    }}




//Overloaded constructor
class Person {
    private String name;
    private int age;

    // Constructor with name parameter
    public Person(String name) {
        this.name = name;
        this.age = 0; // Default age
    }

    // Constructor with name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods to retrieve the values
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

 class OverloadedConstructorExample {
    public static void main(String[] args) {
        // Creating instances using different constructors
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob", 25);

        // Displaying information
        System.out.println("Person 1: Name - " + person1.getName() + ", Age - " + person1.getAge());
        System.out.println("Person 2: Name - " + person2.getName() + ", Age - " + person2.getAge());
    }
}



//Static block
 class StaticBlockExample {

    // Static variable
    static int x;

    // Static block
    static {
        System.out.println("This is a static block.");
        x = 10;
    }

    // Static method
    static void display() {
        System.out.println("The value of x: " + x);
    }

    public static void main(String[] args) {
        // Calling the static method
        display();
    }}

