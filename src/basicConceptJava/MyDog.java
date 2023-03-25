package basicConceptJava;

public class MyDog {
    String colour="white";
    int age = 12;
    int height = 5;
    String breed="boxer";

    public void barking(){
        System.out.println("as dog i can bark");
    }
    public void eating(){
        System.out.println("as dog i can eat");
    }

    public static void main(String[] args) {
        MyDog dogobject= new MyDog();
        System.out.println(dogobject.colour);
        System.out.println(dogobject.age);
        System.out.println(dogobject.breed);
        System.out.println(dogobject.height);
        dogobject.barking();
        dogobject.eating();


    }

}

