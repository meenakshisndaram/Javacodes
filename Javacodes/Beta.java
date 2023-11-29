package Javacodes;

public class Beta {
    public static void main(String[] args) {
        Alpha am1=new Alpha(4);
        Alpha am2=new Alpha(7);
        Alpha [] ar={am1,am2};
        getvalues(am1,am2);
        System.out.println(ar[0].val);
        System.out.println(ar[1].val);
    }
    public static Alpha[] getvalues(Alpha a1, Alpha a2 ){
        a1.val=3;
        Alpha [] fa={a2 , a1};
        return  fa;}}
class Alpha{
    int val=0;
    public Alpha(int val) {
        this.val = val;
    }public int getVal() {
        return val;}
    public void setVal(int val) {
        this.val = val;
    }}


class Special{
    private  StringBuilder s=new StringBuilder("bob");
    StringBuilder geetname(){
        return s;
    }
    void printname(){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Special ss=new Special();
        StringBuilder sw=ss.geetname();
        sw.append("hello");
        ss.printname();;
    }
}
class b{
     int k =0;
}
class a{
    b c;
    public static void main(String[] args) {
        b m=new b();
        a n=new a();
    }}


class Telscope{
    static  int magnify=2;
    public static void main(String...x){
        go();
    }
    static void go(){
        int magnify=3;
        Zoomin();
    }
    static void Zoomin(){
        magnify*=5;
        Zoommore(magnify);
        System.out.println("Zoomin() "+magnify);
    }
    public  static void Zoommore( int s){
        magnify*=7;
        System.out.println("Zoommore() "+ magnify);
    }
}