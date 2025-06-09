package week15;

import java.io.*;
import java.util.Scanner;

public class FileIO {
    public void out(String filename, String word) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./src/week15/"+filename+".txt");
            byte b[] = word.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public String in(String filename) {
        StringBuilder result = new StringBuilder();
        try{
            File file = new File("./src/week15/"+filename+".txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                result.append(scanner.nextLine() + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result.toString();
    }
}