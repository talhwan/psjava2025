import java.util.*;

public class Main20250317 {
    public static void main(String[] args) {
        Main20250317 ps = new Main20250317();
        ps.j001(); //이곳에서 문제 번호에 해당하는 메서드 실행
        //ps.j002();
    }

    //이곳에서 문제 번호에 해당하는 메서드를 완성함
    public void j001() {
        //키와 몸무게로 비만도 계산
        //이곳에 코드 작성!
        int height, weight;
        double bmi;

        Scanner in = new Scanner(System.in);
        height = in.nextInt();
        weight = in.nextInt();
        bmi = weight / (height * height * 0.01 * 0.01);
        bmi = Math.round(bmi * 10) / 10.0;
        System.out.println(bmi);
        in.close();
    }

    public void j002() {
        // 섭씨온도를 화씨온도로 변환
        // 화씨온도 = 섭씨온도 * 1.8 + 32
        //이곳에 코드 작성!
        double c_degree;
        double d_degree;

        Scanner in = new Scanner(System.in);
        c_degree = in.nextDouble();
        d_degree = c_degree * 1.8 + 32;
        System.out.println(d_degree);
        in.close();
    }
}