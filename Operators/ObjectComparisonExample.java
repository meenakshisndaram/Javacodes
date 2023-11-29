package Operators;

class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override equals method to compare content
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }}
public class ObjectComparisonExample {
    public static void main(String[] args) {
        // Creating two objects
        Person person1 = new Person("John", 25);
        Person person2 = new Person("John", 25);
        Person person3 = new Person("Alice", 30);

        // Using == to compare references
        System.out.println("Using == to compare references:");
        System.out.println("person1 == person2: " + (person1 == person2)); // false
        System.out.println("person1 == person3: " + (person1 == person3)); // false

        // Using equals to compare content
        System.out.println("\nUsing equals to compare content:");
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // false
    }
}
