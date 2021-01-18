package Assignment;

import java.util.Scanner;

public class sum23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scan.nextInt();
        int num = a, i = 1, sum = 0;

        while (i <= a)
        {
            sum += i;
            i++;
        }
        System.out.println( "Sum= " + sum);
    }
}
