package week3to11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    int[] numbers;

    public Lotto() {
        //자동으로 6개 번호를 부여함
        remakeAuto();
    }
    public void printNumbers(){
        //로또번호출력
        String numbersString = "";
        for(int i=0; i<numbers.length; i++){
            if("".equals(numbersString)){
                numbersString = ""+numbers[i];
            } else {
                numbersString += ", "+numbers[i];
            }
        }
        System.out.println("Numbers : " + numbersString);
    }
    public void remakeAuto(){
        // 자동으로 로또번호 새로 만들기
        remakeByType(true);
    }
    public void remake(){
        //수동 입력!
        remakeByType(false);
    }
    public void remakeByType(boolean isAuto){
        init();
        for(int i=0; i<numbers.length; i++){
            while(true){
                int num = 0;
                if(isAuto){
                    //1. 자동으로 생성!
                    Random rand = new Random();
                    num = rand.nextInt(45) + 1; // 1 ~ 45
                } else {
                    //2. 직접 입력을 받아야 할때!
                    Scanner sc = new Scanner(System.in);
                    num = sc.nextInt();
                }

                if(num > 0 && num < 45){
                    if(!isExist(num)){
                        numbers[i] = num;
                        //이제 더이상 반복할 필요가 없습니다.
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
        for(int i=0; i<numbers.length; i++){
            if(num == numbers[i]){
                return true;
            }
        }
        return false;
    }

    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) // 마지막 값은 자동 정렬되므로 n-1번까지만 반복한다.
        {
            for (int j = 0; j < n - i - 1; j++) // i번 돌때마다 마지막 값에는 큰 값이 들어오므로 끝까지 비교할 필요가 없다. 따라서 n-i-1번까지만 비교한다.
            {
                if (array[j] > array[j + 1]) // 인접한 2개를 비교했을 때 처음 위치값이 크다면 자리 교환
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
