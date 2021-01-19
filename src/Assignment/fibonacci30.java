package Assignment;

import java.util.Scanner;

public class fibonacci30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number: ");
        int a = scan.nextInt();
        int t1 = 0, t2 = 1;
        System.out.print("First " + a + " terms: ");

        for (int i = 1; i <= a; ++i)
        {
            System.out.print(t1);

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
