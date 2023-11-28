package constructorflow;

public class java2 { }
class A{
    A(){
        print();
    }
    public void  print(){
        System.out.println("Print from the Parent class");
    }
}
class B extends  A{
    int i=4;
    public  void print(){
        System.out.println("Print method in the B ");
        System.out.println(i);
    }

    public static void main(String[] args) {
        A a=new B();
        a.print();
    }}
