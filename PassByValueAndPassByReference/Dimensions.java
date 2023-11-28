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
        Dimension w=new Dimension(55,70);
        dimension d=new dimension();
        System.out.println("The value of Dimension before the Modify method is " +w.height+" "+w.width);
        d.modify(w);
        System.out.println("The values of Dimension after the Modify method is "+w.height+" "+w.width);

    }
    public  void modify(Dimension w1){
        w1.height+=100;

    }
}
