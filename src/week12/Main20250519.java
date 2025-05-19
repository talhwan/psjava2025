package week12;

import java.util.Arrays;

public class Main20250519 {
    public static void main(String[] args) {
        Main20250519 ps = new Main20250519();
        //ps.j011();
        ps.test();
    }

    public void test() {
        /*FileIO fileIO = new FileIO();
        fileIO.out();
        fileIO.in0();
        fileIO.in2();
        fileIO.in3();*/

        String a1 = "0123456789";
        String a2 = "012";
        String a3 = "0123456";
        /*System.out.println(a1.length());
        System.out.println(a2.length());*/

        String[] arr = {a1, a2, a3};
        int maxLength = arr[0].length();
        String maxString = arr[0];
        for(String each : arr) {
            int tempLength = each.length();
            if(tempLength > maxLength){
                maxLength = tempLength;
                maxString = each;
            }
        }

        System.out.println(maxLength);
        System.out.println(maxString);
    }

    public void j082() {
        FileIO fileIO = new FileIO();
        String text = fileIO.inScanner0("./src/week12/j082.txt");
        System.out.println(text);
        String[] datas = text.split("\n");
        int count = 0;
        int countFat = 0;
        for (String data : datas) {
            System.out.println(data);
            String[] words = data.split(" ");
            int height = Integer.parseInt(words[0]);
            int weight = Integer.parseInt(words[1]);
            double bmi = weight / (height * 0.01 * height * 0.01);
            if(bmi >= 25){
                System.out.println("비만");
                countFat++;
            } else {
                System.out.println("정상");
            }
            count++;
        }
        double ratioFat = (double) countFat / count;
        System.out.println(count);
        System.out.println(ratioFat);
    }
    public void j081() {
        FileIO fileIO = new FileIO();
        String text = fileIO.inScanner0("./src/week12/j081.txt");
        text = text.replaceAll("\n", "");
        //System.out.println(text);

        String[] arrayString = text.split(" ");
        int[] arrayInt = new int[arrayString.length];
        for(int i=0;i<arrayString.length;i++) {
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }
        Arrays.sort(arrayInt); // 일단 기본 정렬 완료!!

        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[arrayInt.length-1]);


    }
}
