package Assignment;

import java.util.Scanner;

import java.util.Scanner;
public class rollnumber12 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the roll number, name and nationality: ");
        int roll = scan.nextInt();

        String name = scan.next();

        String nationality = scan.next();

        System.out.println("roll number: " + roll);
        System.out.println("Name of the student is:" + name);
        System.out.println("Nationality of the student is: " + nationality);

    }
}
