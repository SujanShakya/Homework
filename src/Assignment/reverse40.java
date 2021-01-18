package Assignment;

import java.util.Scanner;

public class reverse40 {
    public static void main(String[] args) {
        String reverse = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        String a = scan.nextLine();

        int length = a.length();
        for(int i = length-1; i >=0; i--)
            reverse = reverse + a.charAt(i);

        System.out.println("The reverse of the given string is: " + reverse);




    }
}
