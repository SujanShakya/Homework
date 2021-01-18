package Assignment;

import java.util.Scanner;

public class leapyear17 {
    public static void main(String[] args) {

        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = scan.nextInt();
        boolean isLeap = false;

        if (year / 4 == 0) {
            isLeap = true;
        } else
        {
            isLeap = false;
        }

        if (isLeap == true)
            System.out.println(year + " is a Leap year");
        else
            System.out.println(year + " is not a Leap year");
    }
}
