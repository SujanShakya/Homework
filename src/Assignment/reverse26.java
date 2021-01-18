package Assignment;

import java.util.Scanner;

public class reverse26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scan.nextInt();
        int reverse = 0;

        while (a !=0) {
            reverse = reverse * 10;
            reverse  = reverse + a % 10;
            a = a / 10;
        }
        System.out.println("The reverse number is: " + reverse );

    }

}
