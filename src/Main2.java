import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Main2 ps = new Main2();
        //ps.j001();  //이곳에서 문제 번호에 해당하는 메서드 실행
        ps.j002();  //이곳에서 문제 번호에 해당하는 메서드 실행
    }

    //이곳에서 문제 번호에 해당하는 메서드를 완성함
    public void j001(){
        //키와 몸무게로 비만도 계산
        //이곳에 코드 작성!
        int height, weight;
        double bmi;

        Scanner in = new Scanner(System.in);
        height = in.nextInt();
        weight = in.nextInt();
        bmi = weight / (height * 0.01 * height * 0.01);
        bmi = Math.round(bmi * 10.0) / 10.0;
        System.out.println(bmi);
        in.close();
    }

    public void j002(){
        //섭씨온도를 화씨온도로 변환해주기!!
        double c_degree, f_degree;

        Scanner in = new Scanner(System.in);
        c_degree = in.nextDouble();
        f_degree = c_degree * 1.8 + 32;

        f_degree = Math.round(f_degree * 10.0) / 10.0;
        System.out.println(f_degree);
        in.close();
    }

    public void j003(){

    }
}
