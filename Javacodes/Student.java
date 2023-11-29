package Javacodes;
public class Student {
    public int id = 100;
    public static void main(String[] args) {
        int val = 750;
        Student s1=new Student();
        s1.id=val;
        update(s1);
        System.out.println(s1.id);
        Student s3=new Student();
        s3.id=500;
        switchStudent(s3 , s1);
        System.out.println(s1.id);
        System.out.println(s3.id);
    }
    public static  void switchStudent(Student s1,Student s2) {
        int temp=s1.id;
        s1.id=s2.id;
        s2=new Student();
        s2.id=temp;}
   public static void  update(Student s2){
        s2.id=500;
        s2=new Student();
        s2.id=50;}}
