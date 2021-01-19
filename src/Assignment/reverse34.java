package Assignment;

import java.util.Scanner;

public class reverse34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = scan.nextInt();
        int []arr = new int [n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("The array in reverse order: ");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i] + "");
        }
    }
}
