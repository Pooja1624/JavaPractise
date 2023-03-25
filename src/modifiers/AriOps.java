package modifiers;

public class AriOps {
    // public modifiers which can be accessed from any where from different class, code program

    public int a = 20;
    public float deposit = 300;
     public String name1="Pooja";

     public static void banking(){
         System.out.println(" my account has balance");

     }

    public static void main(String[] args) {
        AriOps myObject= new AriOps();
        System.out.println(myObject.a);
        System.out.println(myObject.deposit);
        System.out.println(myObject.name1);
    }
}
