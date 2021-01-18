package Assignment;

import java.util.Scanner;

public class fac24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the factorial number: ");
        int a = scan.nextInt();
        int num = a, i = 1, fact = 1;

        for( i = 1; i<=a; i++) {
            fact = fact * i;
        }
        System.out.println("The Factorial of the entered number " + num + " is: "+ fact);
    }
}
