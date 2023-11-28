package PassByValueAndPassByReference;

public class Pyhassbyvalue {
    public static void main(String[] args) {
        int score =9;
        modifyscore(score);//passbyvalue
        System.out.println( "The value of score after returning from the modified method is "+score);//Output9
    }
    public static void modifyscore( int score2){
        score2+=2;
        System.out.println("the value of score in the modified score method is "+score2); //Output11
         }}
