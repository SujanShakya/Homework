package Assignment;

import java.util.Scanner;

public class secondlargest35 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 number: ");
        int[] array = new int [5];
        int temp, size;
        size = array.length;


        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("The second largest number is: " + array[size - 2]);
    }
}