package Single_turn_design_pattern;

public class Javateacher {
    private int s;
    private static Javateacher javateacher=null;
    private  Javateacher(){
        System.out.println("Constructor invoked");
    }
    public  static  Javateacher getjavateacher(){
        if(javateacher==null){
            javateacher=new Javateacher();
        }
        return  javateacher;}}
class javaStudent{
    public static void main(String[] args) {
        Javateacher.getjavateacher();
        Javateacher.getjavateacher();
    }}


