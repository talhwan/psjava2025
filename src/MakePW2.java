import java.util.Random;

public class MakePW2 {
    //생성자
    public MakePW2(){

    }
    //암호 만드는 메서드
        /*char sa = 'a'; // 97 ~26개
        char sz = 'z'; // 122
        char ba = 'A'; // 65
        char nn = '0'; // 48

        System.out.println((int) sa);
        System.out.println((int) sz);
        System.out.println((int) ba);
        System.out.println((int) nn);*/
    public void make(int length){
        System.out.println(makePassword(length));
    }

    public void make(int length, int amount){
        for(int i = 0; i < amount; i++){
            make(length);
        }
        //System.out.println(makePassword(length));
    }

    public String makePassword(int length){
        StringBuilder sb = new StringBuilder();
        int[] tempArray = {0,0,0,0};

        String[] tempChar = getChar(0);
        if(length > 0){
            tempArray[0]++;
            sb.append(tempChar[1]);
        }

        for(int i = 0; i<length - 1; i++){
            tempChar = getChar(-1);
            tempArray[Integer.parseInt(tempChar[0] + "")]++;
            sb.append(tempChar[1]);
        }
        //System.out.println(sb.toString());

        //대문자랑 숫자, 기호가 각각 1개 이상인지 확인
        if(length > 0){
            for(int i = 0; i<tempArray.length; i++){
                if(tempArray[i] == 0){
                    //System.out.println(i + "타입 없음!!");
                }
            }
        }

        return sb.toString();
    }

    public String[] getChar(int type) {
        String returnValue = "";
        Random rand = new Random();
        if(type >= 0 && type < 4){
            //이 경우에는 주어진대로만 고고
        } else {
            type = rand.nextInt(4);
        }
        switch (type) {
            case 0:
            {
                int s_a = rand.nextInt(26) + 97; //소문자
                returnValue = (char) s_a + "";
            }
                break;
            case 1:
            {
                int b_a = rand.nextInt(26) + 65; //대문자
                returnValue = (char) b_a + "";
            }
                break;
            case 2:
            {
                int n_n = rand.nextInt(10) + 48; //숫자
                returnValue = (char) n_n + "";
            }
                break;
            case 3:
            {
                String[] sign = {"!", "&", "^", "_", "-"};
                int n_s = rand.nextInt(sign.length); //기호
                returnValue = sign[n_s];
            }
                break;
        }
        String[] returnArray = {type + "", returnValue};
        return returnArray;
    }

}
