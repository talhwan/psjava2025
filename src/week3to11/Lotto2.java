package week3to11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto2 {
    int[] numbers;

    public Lotto2(){
        // 생성자 (자동으로 6개 로또 번호를 부여함)
        remakeAuto();
    }
    public void printNumbers(){
        //로또 번호 출력하기
        String printNums = "";
        for(int i = 0; i<numbers.length; i++){
            if("".equals(printNums)){
                printNums += "" + numbers[i];
            } else {
                printNums += ", " + numbers[i];
            }
        }
        System.out.println("numbers : " + printNums);
    }
    public void remakeAuto(){
        //자동으로 로또번호 새로 만들기
        remakeByType(true);
    }
    public void remake(){
        //사용자에게 로또번호 새로 입력 받기
        remakeByType(false);
    }
    public int checkLotto(int[] check){
        int resultNum = 0;
        for(int i = 0; i<check.length; i++){
            for(int j = 0; j<numbers.length; j++){
                if(check[i] == numbers[j]){
                    resultNum++;
                }
            }
        }
        return resultNum;
    }
    /**/
    public void remakeByType(boolean isAuto){
        init();
        for(int i = 0; i<numbers.length; i++){
            while(true){
                int num = 0;
                if(isAuto){
                    Random randon = new Random();
                    num = randon.nextInt(45) + 1; // 1~45
                } else {
                    Scanner sc = new Scanner(System.in);
                    num = sc.nextInt();
                }
                if(num > 0 && num < 46){
                    if(!isExist(num)){
                        numbers[i] = num;
                        break;
                    }
                }
            }
        }
        Arrays.sort(numbers);
    }
    public void init(){
        numbers = new int[6];
    }
    public boolean isExist(int num){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == num){
                return true;
            }
        }
        return false;
    }
}
