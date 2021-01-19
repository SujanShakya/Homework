package Assignment;

import java.util.Scanner;

public class Initial39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String a = scan.nextLine();

        a = " " + a;
        int pos = a.lastIndexOf( ' ');

        for(int i = 0; i<pos; i++) {
            if(a.charAt(i) == ' ')
                System.out.println(a.charAt(i+1) + ".");
        }
        System.out.println(a.substring(pos));
    }

}
