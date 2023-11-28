package Javacodes;

public class book {
    private  String title;
    public String gettitle(){
        return title;
    }

    public static void main(String[] args) {
        book b=new book();
        String s=b.gettitle();
        if(s!=null){
            System.out.println(s.toLowerCase());
        }
        else {
            System.out.println("s is a null");
        }}}

class Animal {
    public  void animalname(){
        System.out.println("My dog name is Jackie");
    }}
class Animalhunter extends Animal{
    public void animalname(){
        System.out.println("Animal hunter has killed my dog");
    }
    public void animals(){
        System.out.println("I love animals very much");
    }}
class Wild{
    public static void main(String[] args) {
        Animalhunter ah=new Animalhunter();
        Animal a=(Animal) ah;
        Animalhunter ah2=(Animalhunter) a;  //Output
        ah.animals();                       //I love animals very much
        a.animalname();                     //Animal hunter has killed my dog
        ah2.animalname();                   //Animal hunter has killed my dog
         }}
