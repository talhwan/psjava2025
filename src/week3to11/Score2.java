package week3to11;

import java.util.Scanner;

public class Score2 {
    int count;
    int[][] point;
    int[] sum;
    double[] avg;
    String[] grade;

    private Score2(){
    }
    public Score2(int count){
        this.count = count;
        this.point = new int[count][3];
        this.sum = new int[count];
        this.avg = new double[count];
        this.grade = new String[count];
    }
    public int getCursor(){
        for(int i = 0; i < grade.length; i++){
            if(grade[i] == null || grade[i].isEmpty()){
                return i;
            }
        }
        return -1;
    }
    public void getScore(){
        int cursor = getCursor();
        if(cursor == -1){
            System.out.println("FULL");
        } else {
            Scanner in = new Scanner(System.in);
            int tempSum = 0;
            for(int i = 0; i < point[cursor].length; i++){
                point[cursor][i] = in.nextInt();
                tempSum += point[cursor][i];
            }
            sum[cursor] = tempSum;
            avg[cursor] = tempSum / point[cursor].length;
            grade[cursor] = getGrade(avg[cursor]);
        }

    }
    public String getGrade(double tAvg){
        String returnGrade = "";
        if(tAvg >= 90){
            returnGrade = "A";
        } else {
            returnGrade = "F";
        }
        return returnGrade;
    }
    public void printScore(){
        for(int i = 0; i < count; i++){
            if(grade[i] == null || grade[i].isEmpty()){
                break;
            } else {
                System.out.println(grade[i]);
            }
        }
    }
}
