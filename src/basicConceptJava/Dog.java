package basicConceptJava;

public class Dog {
    //state
    static String dogname="xyz";
    static int dogage=12;
    static int dogheight=24;
    static String dogbreed="boxer";

    //behaviour

    public static void barking(){
        System.out.println(" i can bark");

    }
    public static void eating(){
        int a=2;
        System.out.println(" i can eat times a Day");

    }
    public static void main(String[] args) {
        System.out.println(dogage);
        System.out.println(dogage);
        System.out.println(dogheight);
        System.out.println(dogbreed);
        barking();
        eating();





    }


}
