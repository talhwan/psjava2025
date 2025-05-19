package week12;

import java.io.*;
import java.util.Scanner;

public class FileIO {
    public void out() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("outtest.txt");
            /*
            FileOutputStream fileOutputStream = new FileOutputStream("test003.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("testout.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("fileoutputstream.txt");
            FileOutputStream fileOutputStream1 = new FileOutputStream("C:/workspace/git/psjava2025/testout.txt");
            FileOutputStream fileOutputStream2 = new FileOutputStream("./testout.txt");
             */
            String word = "pgm studio 4th class!!";

            byte b[] = word.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void in0() {
        try{
            FileInputStream fileInputStream = new FileInputStream("fileoutputstream1111.txt");
            FileInputStream fileInputStream1 = new FileInputStream("./fileoutputstream.txt");

            int i =0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void in0_2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("fileoutputstream1111.txt");
        int i = 0;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
        fileInputStream.close();
    }
    public void in1() {
        try{
            FileInputStream fileInputStream = new FileInputStream("C:/workspace/git/psjava2025/src/week12/test1.txt");
            FileInputStream fileInputStream1 = new FileInputStream("./src/week12/test1.txt");

            int i =0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void in2() {
        try{
            FileInputStream fileInputStream = new FileInputStream("C:/workspace/git/psjava2025/src/week12/test1.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            /*
            BufferedInputStream을 사용
            BufferedInputStream 보조 스트림을 사용
            성능 향상
             */

            int i = 0;
            while ((i = bufferedInputStream.read()) != -1){
                System.out.print((char)i);
            }
            fileInputStream.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void in3() {
        try{
            File file = new File("test.txt");
            FileReader fileReader = new FileReader(file);

            int i = 0;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
            fileReader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void in4() {
        try{
            File file = new File("test.txt");
            Scanner scanner = new Scanner(file);
            int order = 0;
            while (scanner.hasNextLine()) {
                System.out.println("data order : " + order++);
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public String inScanner0(String src) {
        StringBuilder result = new StringBuilder();
        try{
            File file = new File(src);
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