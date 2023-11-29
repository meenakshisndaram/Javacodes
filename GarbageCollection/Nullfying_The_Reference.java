package GarbageCollection;

public class Nullfying_The_Reference { }
class Students{
    public static void main(String[] args) {
        Students s1=new Students();
        Students s2=new Students();
        Students s3=new Students();
        s2=null; // by nullfying the reference of s2 it will be of Grabage collected;
    }
}
class Studenst2{
    public static void main(String[] args) {
        Studenst2 s1=new Studenst2();
        s1=new Studenst2(); //reasining the reference varible to new object

    }}
class Students3{
    public static void main(String[] args) {
            Students3 s3=m1();
    }
    public static Students3 m1(){
        Students3 st=new Students3();
        Students3 st2=new Students3();
        return st;    //By of passing or assigining the object via methods return type if
        // it return  null it will be of garbage collected
    }}


