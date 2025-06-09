package week3to11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MakePW {

    public MakePW() {
    }
    public void make(int length){
        StringBuilder returnVal = new StringBuilder();
        for(int i=0; i<length; i++){
            returnVal.append(getChar());
        }
        /*
        String returnVal = "";
        for(int i=0; i<length; i++){
            returnVal += getChar();
        }
        */
        System.out.println(returnVal);
    }
    public void make(int length, int amount){
        for(int i=0; i<amount; i++){
            make(length);
        }
    }

    public String getChar(){
/*

        char a_big = 'A'; // ~26개
        char a_small = 'a'; // ~26개
        char num = '0'; //~10

        System.out.println((int)a_big); // 65
        System.out.println((int)a_small); // 97
        System.out.println((int)num); // 48
*/

        Random random = new Random();
        //random.nextInt(26); // 0 ~ 25
        int nextType = random.nextInt(3);
        char returnChar = 'A';
        switch (nextType){
            case 0:
            {
                //대문자
                int nextBigChar = random.nextInt(26) + 65;
                returnChar = (char) nextBigChar;
            }
                break;
            case 1:
            {
                //소문자
                int nextSmallChar = random.nextInt(26) + 97;
                returnChar = (char) nextSmallChar;
            }
                break;
            case 2:
            {
                //숫자
                int nextNumber = random.nextInt(10) + 48;
                returnChar = (char) nextNumber;
            }
                break;
        }
        return returnChar + "";
    }

}
