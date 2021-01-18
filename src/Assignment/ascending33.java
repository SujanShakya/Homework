package Assignment;

import java.util.Scanner;

public class ascending33 {
    public static void main(String[] args) {
        int temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total numbers: ");
        int x = scan.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = scan.nextInt();
        }
        for(int i=0; i<x; i++) {
            for(int j=i+1; j<x;j++) {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The ascending order is: ");
        for(int i = 0; i<x; i++) {
            System.out.println(a[i]);
        }


    }
}
