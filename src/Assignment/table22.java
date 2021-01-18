package Assignment;

import java.util.Scanner;

public class table22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to print table: ");
        int n = scan.nextInt();

        for(int i=1; i <= 10; i++) {
            System.out.println( n + " * " + i + " = " + n * i );
        }
    }
}
