package week12;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main20250519004 {
    public static void main(String[] args) {
        Main20250519004 ps = new Main20250519004();
        ps.j082();
    }

    public void j081() {
        StringBuilder tempText = new StringBuilder();
        try{
            FileInputStream fileInputStream = new FileInputStream("C:/workspace/git/psjava2025/src/week12/j081.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1){
                tempText.append((char) i);
            }
            fileInputStream.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        String text = tempText.toString();
        //System.out.println(text);

        // 10000 20 30 40 50 60 70 80 90 100
        String[] datas = text.split(" ");
        int[] arr = new int[datas.length];

        for (int i = 0; i < datas.length; i++) {
            arr[i] = Integer.parseInt(datas[i]);
        }
        /*
        System.out.println(arr);
        for(int each : arr){
            System.out.println(each);
        }

        Arrays.sort(arr);
        for(int each : arr){
            System.out.println(each);
        }
        */
        Arrays.sort(arr);

        System.out.println("Maximum number : " + arr[arr.length-1]);
        System.out.println("Minimum number : " + arr[0]);
    }

    public void j082() {
        StringBuilder tempString = new StringBuilder();
        try{
            File file = new File("./src/week12/j082.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                tempString.append(scanner.nextLine() + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        String data = tempString.toString();
        String[] datas = data.split("\n");
        int count = 0;
        int countFat = 0;
        for(String each : datas){
            //System.out.println(each);
            String[] arr = each.split(" ");
            int height = Integer.parseInt(arr[0]);
            int weight = Integer.parseInt(arr[1]);
            double bmi = (double) (weight / (height * 0.01 * height * 0.01));
            if(bmi >= 25){
                //System.out.println("Yes");
                countFat++;
            } else {
                //System.out.println("No");
            }
            count++;
        }
        double ratio = (double) 100 * countFat / count;
        //System.out.println(ratio);

        String tempS0 = "s";
        if(count < 2){
            tempS0 = "";
        }
        String tempS1 = "s";
        if(countFat < 2){
            tempS1 = "";
        }

        System.out.println("all " + count + " person"+tempS0+".");
        System.out.println("Total overweight person"+tempS1+": " + countFat +"(" + ratio + "%)");
    }
}
