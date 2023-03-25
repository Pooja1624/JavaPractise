package arrayTopic;

public class SecondArray {
    public static void main(String[] args) {
        String car1 = "BMW";
        String car2 = "volvo";
        String car3 = "MINI";
        String car4 = "Hyundai";
        String[] arrCars = {"BMW", "volvo", "MINI", "Hyundai"};
        int myArraylength = arrCars.length;
        System.out.println(myArraylength);
        // to print all carz name

        for (int i = 0; i < myArraylength; i++) {
            System.out.println(arrCars[i]);
        }
        // to reverse print
        for (int i = myArraylength-1; i>=0; i--) {
            System.out.println(arrCars[i]);
        }
    }

    }