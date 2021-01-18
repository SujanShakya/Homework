package Assignment;

import java.util.Scanner;

public class odd16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = input.nextInt();

        if (i % 2 == 0) {
            System.out.println("The entered number is even.");
        }        else {
            System.out.println("The entered number is 0dd.");
        }
    }
}
