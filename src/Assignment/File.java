package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class File {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Owner\\Desktop\\Sujan.txt"));
            String currentLine = reader.readLine();
            while(currentLine!=null) {
                String words[] = currentLine.toLowerCase().split(" ");

                for(String word:words) {
                    if(hm.containsKey(word)) {
                        hm.put(word,hm.get(word)+1);
                    }
                    else {
                        hm.put(word,1);
                    }
                }
                currentLine = reader.readLine();
            }
            String repeated = null;
            int count = 0;
            Set<Map.Entry<String,Integer>> entrySet=hm.entrySet();
            for(Map.Entry<String,Integer> entry:entrySet) {
                if(entry.getValue()>count) {
                    repeated=entry.getKey();
                    count=entry.getValue();
                }
            }
            System.out.println("The most repeated word is: " +repeated);
            System.out.println("The number of repeated number of the word is: " +count);

        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                reader.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
