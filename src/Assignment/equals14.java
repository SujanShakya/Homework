package Assignment;

import java.util.Scanner;

public class equals14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();

        System.out.println("Enter the second number:");
        int b = scan.nextInt();

        if( a == b ) {
            System.out.println(" a = b ");
        } else if ( a > b ) {
            System.out.println(" a > b");
        } else {
            System.out.println(" a < b ");
        }
    }
}
