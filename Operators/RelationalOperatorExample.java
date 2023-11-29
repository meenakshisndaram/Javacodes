package Operators;


import org.w3c.dom.NamedNodeMap;

public class RelationalOperatorExample {
        public static void main(String[] args) {
            int a = 5;
            int b = 10;

            // Equal to
            System.out.println("Is a equal to b? " + (a == b));

            // Not equal to
            System.out.println("Is a not equal to b? " + (a != b));

            // Greater than
            System.out.println("Is a greater than b? " + (a > b));

            // Less than
            System.out.println("Is a less than b? " + (a < b));

            // Greater than or equal to
            System.out.println("Is a greater than or equal to b? " + (a >= b));

            // Less than or equal to
            System.out.println("Is a less than or equal to b? " + (a <= b));
        }
    }

class Student{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Animal S= new Animal();
        System.out.println(s1==s2);
        Student s4=s3;
        System.out.println(s4==s3);
        //System.out.println(S==s4);   Error
    }}
class String23{
    public static void main(String[] args) {
        String s=new String("hello");
        String s2=new String("hello");
        System.out.println(s.equals(s2));//Output:True
        System.out.println(s==s2);       // Output:False
    }
}

