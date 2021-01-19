package Assignment;

import java.util.Scanner;

public class Duplicate42 {
    public static void main(String[] args) {
        int count;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the long String: ");
        String line = scan.next();
        String words[] = line.split("");

        System.out.println("The Duplicate words in a given string are: ");
        for(int i = 0; i<words.length; i++) {
            count = 1;
            for(int j = i+1; j< words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    words[j]="0";
                }
            }
            if(count >1 && words[i] != "0")
            System.out.println(words[i]);
        }
    }
}
