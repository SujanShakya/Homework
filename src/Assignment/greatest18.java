package Assignment;

import java.util.Scanner;

public class greatest18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scan.nextInt();

        System.out.println("Enter the second number: ");
        int b = scan.nextInt();

        System.out.println("Enter the third number: ");
        int c = scan.nextInt();

        if ( a > b && a > c) {
            System.out.println("a is largest number.");
        }
        else if( b  > c ) {
            System.out.println("b is greater number");
        }
        else {
            System.out.println("c is greater one");
        }
    }
}
