package Thiskeyword;

public class java1 {
    String name="meenakshi sundaram";
    public void m1(){                       //output
        System.out.println(this);           //Thiskeyword.java1@1b6d3586
        System.out.println("hello");        //hello
        System.out.println(this.name);      //menakshi sundaram

    }
    public static  void  m2(){
       // System.out.println(this);  error because it is a static method there is no current object to call thi method

    }

    public static void main(String[] args) {
        java1 j=new java1();
        j.m1();
        m2();
    }
}
