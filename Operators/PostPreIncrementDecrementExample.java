package Operators;
//Post and pre Increment and Decrement
public class PostPreIncrementDecrementExample {
    public static void main(String[] args) {
        int x = 5;

        // Post-increment operator
        int postIncrementResult = x++;
        System.out.println("Original value of x: " + x);
        System.out.println("Result after post-increment: " + postIncrementResult);

        // Post-decrement operator
        int postDecrementResult = x--;
        System.out.println("Value of x after post-increment: " + x);
        System.out.println("Result after post-decrement: " + postDecrementResult);

        // Pre-increment operator
        int preIncrementResult = ++x;
        System.out.println("Value of x after pre-increment: " + x);
        System.out.println("Result after pre-increment: " + preIncrementResult);

        // Pre-decrement operator
        int preDecrementResult = --x;
        System.out.println("Value of x after pre-decrement: " + x);
        System.out.println("Result after pre-decrement: " + preDecrementResult);
    }}

//StringConcatenationWithIntExample
class StringConcatenationWithIntExample {
    public static void main(String[] args) {
        String n="79";

        int count = 42;

        // Concatenation of string and int using the + operator
        String result = n + count;

        System.out.println(result);
    }
}


class incremenetanddecremenet{
    int x=89;
    // int y=++10;error
    // int z=(++(++x));error
    final  int y=98;
    // y=76; error
    public static void main(String[] args) {
        char ch='a'; //value of a =97
        System.out.println(++ch);// ++ch = 97 + 1= 98  Output b
        System.out.println('a'+'b'); //output 195
        System.out.println("a"+"b"); //output ab

    }}
class doen{
    public static void main(String[] args) {
       // System.out.println(5/0);
        System.out.println(5/0.0);
        System.out.println(0.0/0);
        System.out.println(-5/0.0);
        System.out.println(-0/0.0);

    }
}