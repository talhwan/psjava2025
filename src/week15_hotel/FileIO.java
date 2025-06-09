package week15_hotel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileIO {
    String rootPath = "./src/week15_hotel/";
    public void out(String filename, String word) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(rootPath+filename+".txt");
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
            File file = new File(rootPath+filename+".txt");
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