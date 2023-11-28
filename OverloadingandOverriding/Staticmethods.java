package OverloadingandOverriding;

public class Staticmethods { }
class  A{
    public static  void m1(){
        System.out.println("hello from A");
    }
}
class b extends A{
    public static void  m1(){
        System.out.println("hello from B");
    }
}
class test{
    public static void main(String[] args) {
        A a=new b();
        a.m1();    //Output will be of "hello from A" because the static methods
        // and differentvariables.variables will not get inherited only the instance methods get inherited
    }}
