import java.util.Scanner;

public class Main20250331004 {
    public static void main(String[] args) {
        Main20250331004 ps = new Main20250331004();
        //ps.j021();
        ps.j022();
    }

    public void j021() {
        int height, weight;
        double bmi;
        int people = 0;

        int number;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        // 1. for 문을 사용해서 해결
        /*
        for(int i=0;i<number;i++) {
            height = in.nextInt();
            weight = in.nextInt();
            bmi = weight / (height * 0.01 * height * 0.01);
            if(bmi >= 25){
                //비만인 경우!
                people++;
            }
        }
        System.out.println(people);
        */

        //2. while 문을 사용!
        /*
        int tempOrder = 0;
        while(true){
            tempOrder++;
            height = in.nextInt();
            weight = in.nextInt();
            bmi = weight / (height * 0.01 * height * 0.01);
            if(bmi >= 25){
                people++;
            }
            if(tempOrder == number){
                break;
            }
        }
        System.out.println(people);
        */

        // 3. 배열을 통해 구현!
        /*
        int[] heights = new int[number];
        int[] weights = new int[number];
        for(int i=0; i<heights.length; i++){
            heights[i] = in.nextInt();
            weights[i] = in.nextInt();
            bmi = weights[i] / (heights[i] * 0.01 * heights[i] * 0.01);
            if(bmi >= 25){
                people++;
            }
        }
        System.out.println(people);
        */

        // 4. 2차원 배열을 사용해보기
        int[][] data = new int[number][3];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < 2; j++) {
                data[i][j] = in.nextInt(); // 키, 몸무게 입력 받기!
                bmi = data[i][1] / (data[i][0] * 0.01 * data[i][0] * 0.01);
                if(bmi >= 25){
                    data[i][2] = 1;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            if(data[i][2] == 1){
                people++;
            }
        }
        System.out.println(people);
    }

    public void j022() {
        double m2_area, pyung_area;
        int count1, count2, count3, count4;
        count1 = 0;
        count2 = 0;
        count3 = 0;
        count4 = 0;
        int[] counts = new int[4];
        String[] titles = {"small", "normal", "large", "huge"};

        Scanner in = new Scanner(System.in);
        int number = 10;
        for(int i = 0; i < number; i++){
            m2_area = in.nextDouble();
            pyung_area = m2_area / 3.305;

            if(pyung_area < 15){
                count1++;
                counts[0]++;
            } else if(pyung_area < 30){
                count2++;
                counts[1]++;
            } else if(pyung_area < 50){
                count3++;
                counts[2]++;
            } else {
                count4++;
                counts[3]++;
            }
        }
        for(int i = 0; i < titles.length; i++){
            String printData = "";
            if(i == 0){
                printData = titles[i] + " - " + count1;
            }else if(i == 1){
                printData = titles[i] + " - " + count2;
            } else if(i == 2){
                printData = titles[i] + " - " + count3;
            } else {
                printData = titles[i] + " - " + count4;
            }
            System.out.println(printData);
            System.out.println(titles[i] + " - " + counts[i]);
        }
    }
}
