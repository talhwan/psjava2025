package week3to11;

import java.util.Scanner;

public class Main20250325004 {
    public static void main(String[] args) {
        Main20250325004 ps = new Main20250325004();
        //ps.j011();
        ps.j012();
    }

    public void j011() {
        int height, weight;
        double bmi;

        Scanner in = new Scanner(System.in);
        height = in.nextInt();
        weight = in.nextInt();

        bmi = weight / (height * 0.01 * height * 0.01);

        String result = "";
        if(bmi >= 25){
            result = "Yes";
        } else {
            result = "No";
        }
        bmi = Math.round(bmi * 10) / 10.0;
        System.out.println(bmi);
        System.out.println(result);
    }

    public void j012() {
        double m2_area, pyung_area;
        Scanner in = new Scanner(System.in);
        m2_area = in.nextDouble();
        pyung_area = m2_area / 3.305;

        String result = "";
        if(pyung_area < 15){
            result = "small";
        } else if(pyung_area < 30){
            result = "normal";
        } else if(pyung_area < 50){
            result = "large";
        } else {
            result = "huge";
        }

        pyung_area = Math.round(pyung_area * 10) / 10.0;

        System.out.println(m2_area);
        System.out.println(pyung_area);
        System.out.println(result);


    }
}