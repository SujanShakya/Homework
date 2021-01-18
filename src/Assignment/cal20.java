package Assignment;

import java.util.Scanner;

public class cal20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a = scan.nextInt();

        System.out.println("Enter the second number: ");
        int b = scan.nextInt();

        System.out.println("Enter Choice: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Addition");
                System.out.println("The sum of two number is: " + (a + b));
            }
            case 2 -> {
                System.out.println("Subtraction");
                System.out.println("The sub of two number is: " + (a - b));
            }
            case 3 -> {
                System.out.println("Multiplication");
                System.out.println("The multiplication of two number is:" + (a * b));
            }
            case 4 -> {
                System.out.println("Division");
                System.out.println("The division of two number is: " + (a / b));
            }
        }
    }
}
