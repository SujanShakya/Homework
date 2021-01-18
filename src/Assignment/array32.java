package Assignment;

import java.util.Scanner;

public class array32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int [5];
        System.out.println("Enter 5 number: ");
        int sum = 0;

        for( int i=0; i<5; i++) {
            array[i] = scan.nextInt();
        }

        for( int num : array) {
            sum = sum + num;
        }
        System.out.println("The sum of the number is: " + sum);
    }
}
