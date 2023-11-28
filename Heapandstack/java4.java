package Heapandstack;
//local variables are always placed in the stack (Visible only within the block or same method )
//instance variables is stored in the heap

public class java4 {}
class s{
    int x=30;
    static  int y=66;
    public static void main(String[] args) {
        int x=89;
        int y=77;
        s w=new s();
        System.out.println(x);    //89
        System.out.println(w.x);  //30
        System.out.println(y);    //77
    }
}

