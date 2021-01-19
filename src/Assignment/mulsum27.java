package Assignment;

import java.util.Scanner;

public class mulsum27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scan.nextInt();
        int sum = 0;
        int mul = 1;

        while( a != 0) {
            sum = sum + (a % 10);
            mul = mul * (a % 10);
            a = a / 10;
        }


        System.out.println("The sum of the digits is: " + sum );
        System.out.println("The multiplication of the numbers is: " + mul);
    }
}
