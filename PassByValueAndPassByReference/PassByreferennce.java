package PassByValueAndPassByReference;

public class PassByreferennce {
    public static void main(String[] args) {
        Student sc=new Student();
        System.out.println("The mark of the student before passing on to the modify method is "+ sc.mark); //80
        modify(sc);
        System.out.println("The mark of the student in after the Modify method is "+sc.mark);//190
    }
    public static void modify(Student sd){
        sd.mark=190;
        System.out.println("The mark of the student in the Modify method is "+sd.mark);//190
    }
}

class Student{
    public int getSd() {
        return mark;}
    public void setSd(int sd) {
        this.mark = sd;}
    int mark =80;}



class foo{
    static  int size=7;
    static void changeit(int s){
        size=s+200;
        System.out.println(size);
    }

    public static void main(String[] args) {
        foo f=new foo();
        changeit(size);
        System.out.println(size);
    }
}