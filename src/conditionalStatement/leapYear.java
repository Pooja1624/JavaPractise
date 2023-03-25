package conditionalStatement;

public class leapYear {
    public static void checkLeapYear(int year) {

        if (year > 0) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("It is a Leap Year");
            } else {
                System.out.println(" It is not a leap Year");
            }
        } else {
            System.out.println("Enter correct year");
        }
    }

    public static void main(String[] args) {
        checkLeapYear(0);
    }
}

