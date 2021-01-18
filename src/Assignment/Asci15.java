package Assignment;

import java.util.Scanner;

public class Asci15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the ASCII code:");
        int number = scan.nextInt();

        System.out.println("The character for ASCII code " + number + " is " + (char) number);
    }
}
