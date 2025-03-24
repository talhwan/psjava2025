import java.util.Scanner;

public class Main20250325 {
    public static void main(String[] args) {
        Main20250325 ps = new Main20250325();
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
        //bmi = Math.round(bmi * 10) / 10.0;
        //조건문을 사용하는 경우!!
        // bmi 가 25이상인 경우는 비만! / 25미만인 경우는 비만 아님!
        if(bmi >= 25){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public void j012() {
        double m2_area, pyung_area;
        Scanner in = new Scanner(System.in);
        m2_area = in.nextDouble();

        //평형수 = 미터 제곱 / 3.305;
        pyung_area = m2_area / 3.305;
        /*
        15평 미만 : small
        15~30 : normal
        30~50 : large
        50 이상 : huge
         */
        String result = "";
        if(pyung_area < 15){
            result = "small";
        } else if(pyung_area >= 15 && pyung_area < 30){ // 15이상인 부분은 있는 것이 의미 없음..
            result = "normal";
        } else if(pyung_area < 50){
            result = "large";
        } else {
            result = "huge";
        }

        pyung_area = Math.round(pyung_area * 10) / 10.0;
        System.out.println(pyung_area);
        System.out.println(result);


    }
}