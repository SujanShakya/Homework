package Assignment;

import java.util.Scanner;

public class palindrome38 {
    public static void main(String[] args) {

        String rev = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = scan.nextLine();

        int length = a.length();
        for(int i = length - 1; i>=0; i--) {
            rev = rev + a.charAt(i);
        }
        if(a.equals(rev)) {
            System.out.println(a + "is a palindrome");
        } else {
            System.out.println(a + "is not a palindrome");
        }

    }
}
