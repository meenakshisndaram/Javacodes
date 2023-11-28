package PassByValueAndPassByReference;

import java.awt.*;

public class Dimensions {
    public static void main(String[] args) {
        Dimension s=new Dimension(10,40);
        System.out.println("Before passing to Dimension s the values of height and width are "+s.height+" "+s.width);
        Dimension s1=s;
        s1.height=97;
        System.out.println("After passing to Dimension s the values of height and width are " +s.height+" "+s.width);

    }}
class dimension{
    public static void main(String[] args) {
        Dimension w=new Dimension();
        dimension d=new dimension();

    }
    public  void modify(){}
}
