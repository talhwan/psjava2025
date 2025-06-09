package week3to11;

import java.util.Scanner;

public class Main20250331003 {
    public static void main(String[] args) {
        Main20250331003 ps = new Main20250331003();
        ps.j022();
    }

    public void j021() {
        int people;
        int sum = 0;

        Scanner in = new Scanner(System.in);
        people = in.nextInt();
        // 1) for 문 사용
        /*for(int i=0;i<people;i++) {
            int height = in.nextInt();
            int weight = in.nextInt();
            double bmi = weight / (height * 0.01 * height * 0.01);
            if(bmi >= 25){
                // 비만입니다!!
                sum++;
            }
        }
        System.out.println(sum);*/
        // 2) while 문 사용
        /*
        int sum2 = 0;
        int temp_i = 0;
        while(true){
            temp_i++;
            int height = in.nextInt();
            int weight = in.nextInt();
            double bmi = weight / (height * 0.01 * height * 0.01);
            if(bmi >= 25){
                // 비만입니다!
                sum2++;
            }
            if(temp_i == people){
                break;
            }
        }
        System.out.println(sum2);
        */

        // 3) 굳이 array 선언하고 거기에 저장해서, 비만 여부 판단도 해보기!
        /*int sum3 = 0;
        int[] heights = new int[people];
        int[] weight = new int[people];
        for(int i = 0; i < heights.length; i++) {
            heights[i] = in.nextInt();
            weight[i] = in.nextInt();
            double bmi = weight[i] / (heights[i] * 0.01 * heights[i] * 0.01);
            if(bmi >= 25){
                //비만입니다.
                sum3++;
            }
        }
        System.out.println(sum3);*/

        // 4) 2차원 배열을 활용해보기
        int[][] data = new int[people][3];
        /*
        {
            {178, 72, 0},
            {178, 72, 0}
        }
        * */
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < 2; j++) {
                data[i][j] = in.nextInt(); // 키 , 몸무게 순차적으로 입력 받기!
                double bmi = data[i][1] / (data[i][0] * data[i][0] * 0.01 * 0.01);
                if(bmi >= 25){
                    data[i][2] = 1;
                }
            }
        }
        int sum4 = 0;
        for(int i = 0; i < data.length; i++) {
            if(data[i][2] == 1){
                sum4++;
            }
        }
        System.out.println(sum4);
    }
    public void j022() {
        int number = 10;
        int[] type = new int[4];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<number;i++) {
            double m2_area = in.nextDouble();
            // 평으로 변환!
            // 4가지 종류로 판단!
        }
    }


}