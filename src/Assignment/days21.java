package Assignment;

import java.util.Scanner;

public class days21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter choice: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Today is Sunday");
                break;
            }
            case 2 -> {
                System.out.println("Today is Monday");
                break;
            }
            case 3 -> {
                System.out.println("Today is Tuesday");
                break;
            }
            case 4 -> {
                System.out.println("Today is Wednesday");
                break;
            }
            case 5 -> {
                System.out.println("Today is Thursday");
                break;
            }
            case 6 -> {
                System.out.println("Today is Frida");
                break;
            }
            case 7 -> {
                System.out.println("Today is Saturday");
                break;
            }
        }
    }
}
