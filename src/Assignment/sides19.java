package Assignment;

import java.util.Scanner;

public class sides19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 1st side: ");
        int a = scan.nextInt();

        System.out.println("Enter the 2nd side: ");
        int b = scan.nextInt();

        System.out.println("Enter the 3rd side: ");
        int c = scan.nextInt();

        if (a == b && a == c) {
            System.out.println("It is an EQUILATERAL triangle.");
        }
        else if ( b == c) {
            System.out.println("It is a ISOSCELES triangle.");
        }
        else {
            System.out.println("It is a SCALENE triangle. ");
        }
    }

}
