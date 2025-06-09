package week3to11;

import java.util.Scanner;

public class Score {

    int count;
    int[][] jumsu;
    int[] sum_student;
    double[] avg_student;
    int cursor;

    public Score() {}
    public Score(int count) {
        this.count = count;
        this.jumsu = new int[count][3];
        this.sum_student = new int[count];
        this.avg_student = new double[count];
        this.cursor = 0;
    }
    public void getScore(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < jumsu[cursor].length; i++){
            jumsu[cursor][i] = sc.nextInt();
            sum += jumsu[cursor][i];
        }
        sum_student[cursor] = sum;
        avg_student[cursor] = sum / jumsu[cursor].length;
        cursor++;
    }
    public void printScore(){
        for(int i = 0; i < cursor; i++){
            for(int j = 0; j < jumsu[i].length; j++){
                System.out.print("각 과목 점수 : ");
                System.out.print(jumsu[i][j] + " ");
            }
            System.out.print("| 총점 : ");
            System.out.print(sum_student[i] + " ");
            System.out.print("| 평균 : ");
            System.out.print(avg_student[i] + " ");
            System.out.println("");
        }
    }

}
