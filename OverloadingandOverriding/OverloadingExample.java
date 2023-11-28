package OverloadingandOverriding;
//method overloading
public class OverloadingExample {

    // Method with two parameters of different types
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with three parameters of different types
    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two integers: " + add(5, 10));
        System.out.println("Sum of three doubles: " + add(2.5, 3.5, 1.0));
    }}


//Example 2

class Animal1{ }
class Monkey extends Animal1{}
class Test{
    public void  m(Animal1 a){
        System.out.println("Animal type");
    }
    public  void m(Monkey m){
        System.out.println("Monkey Type");}
    public static void main(String[] args) {
        Test t1 = new Test();
        Animal1 a = new Animal1();        //output
        t1.m(a);                        //Animal type
        Monkey m = new Monkey();
        t1.m(m);                        //Monkey type
        Animal1 am = new Monkey();
        t1.m(am);                       //Animal type
    }}

//Example 3
//Calling parent method
class friends{
    public static void main(String...args) {
        System.out.println("We all need a good friends");
    }
}
class School {
    public  void Schoolfriends(){
        System.out.println("School friends ARE ALWAYS GREAT");
        friends.main();


    }

    public static void main(String[] args) {
        School sc=new School();
        sc.Schoolfriends();

    }
}