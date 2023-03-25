package arrayTopic;

public class FirstArray {
    public static void main(String[] args) {
        int a= 10;
        int b=20;
        int c=30;
        int d=40;

        int[] arr={10,20,30,40};
//  index           0  1  2  3
        System.out.println(arr[3]);

        // operation
        arr[0]=50;
        arr[1]=arr[0]+arr[3];
        System.out.println(arr[1]);
    }





}
