package differentvariables;

public class instancevariables {
    int i;

    public static void main(String[] args) {
        instancevariables v=new instancevariables(); //output
        System.out.println(v.i);                     //o
    }}
class localvariables{
    public void  m1(){
        int i;                      //Output
        //System.out.println(i);    //variable i might not have been initialized
        // because the local variables will not get executed or assigned
    }

    public static void main(String[] args) {
        localvariables l=new localvariables();
        l.m1();
    }
}
