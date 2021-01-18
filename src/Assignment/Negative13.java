package Assignment;

import java.util.Scanner;

public class Negative13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers.");
        int i = scan.nextInt();

        if(i < 0) {
            System.out.println("Your entered numbers are: " + i);
        } else {
            System.out.println("No numbers are less than o. ");
        }
    }
}
