package Assignment;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press ");
        System.out.println("1 to Open Bank Account");
        System.out.println("2 to Deposit Amount");
        System.out.println("3 to Withdraw Amount");
        System.out.println("4 to Display Amount");
        System.out.println("5 to exit");

        String a = "";
        double b = 0;
        boolean condition = true;
        while (condition) {
            System.out.println("Enter choice:");
            int choice = scan.nextInt();


            switch (choice) {
                case 1 -> {
                    System.out.println("Open Bank Account: ");
                    System.out.println("Enter your name: ");
                    a = scan.next();

                }
                case 2 -> {
                    System.out.println("Deposit Amount");
                    System.out.println("Enter the total amount: ");
                    double c = scan.nextDouble();
                    b=b+c*1.05;

                    System.out.println("The total amount deposited is: " + b );

                }
                case 3 -> {
                    System.out.println("Withdraw Amount");
                    System.out.println("Enter the total amount to be withdrawn: ");
                    double d = scan.nextDouble();
                    b=b-d-5;
                    System.out.println("The total amount on the acount is: " + b );


                }
                case 4 -> {
                    System.out.println("Display");
                    System.out.println("Account name: " + a );
                    System.out.println("Acount Balance: " + b );
                }
                case 5 -> {
                    condition = false;
                }
            }
        }
    }
}
