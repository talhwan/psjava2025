import java.util.Scanner;

public class Main20250407004 {
    public static void main(String[] args) {
        Main20250407004 ps = new Main20250407004();
        ps.test();
    }

    public void quiz() {
        /*
        00:00 00:01 .... 23:59

        ~00:29

        3이 하나라도 들어간 시계 의 총 분
        * */
        int totalCount = 0;
        int threeCount = 0;
        int threeCount1 = 0;
        for(int i=0;i<=23;i++){
            //시!!
            for(int j=0;j<=59;j++){
                //분!!
                //System.out.println(i+":"+j);
                totalCount++;
                String clock = get2digitNumber(i)+":"+get2digitNumber(j); //01:03
                if(clock.contains("3")){
                    System.out.println(clock);
                    threeCount++;
                }
                if(clock.indexOf("3") != -1){
                    threeCount1++;
                }
            }
        }
        System.out.println(totalCount);
        System.out.println(threeCount);
        System.out.println(threeCount1);
    }
    public String get2digitNumber(int num){
        if(num < 10){
            return "0"+num;
        }
        return num + "";
    }
    public String setSameSpace(String str){
        if(str.length() > 20){
            return str.substring(0, 20);
        } else {
            String resultString = "";
            resultString = str;
            for(int i=0; i<20-str.length(); i++){
                resultString += " ";
            }
            return resultString;
        }
    }

    public void test() {
        String text;
        text = null;
        text = "0123456789";
        String text2 = "a";

        System.out.println(setSameSpace(text) + "/ " + setSameSpace(text));
        System.out.println(setSameSpace(text2) + "/ " + setSameSpace(text2));

        String sub1 = text.substring(0,5);
        String sub2 = text.substring(5);

        /*System.out.println("sub1 : " + sub1);
        System.out.println("sub2 : " + sub2);
        System.out.println("text : " + text);
        System.out.println("text.length() : " + text.length());

        Car2 car = new Car2();
        Car2 car1 = new Car2();
        car.setProductNumber("p001");
        car1.setProductNumber("p002");
        car.printAll();
        car1.printAll();
        */
    }

    public void j031() {
        //id, pw, name
        String userId, password, name;
        Scanner sc = new Scanner(System.in);
        userId = sc.nextLine();
        password = sc.nextLine();
        name = sc.nextLine();

        if(password.length() < 3){
            System.out.println("password length less than 3");
        } else {
            String printPw = "";
            String printPw2 = "";
            for(int i=0;i<password.length();i++){
                if(i >= 2){
                    printPw += "*";
                    printPw2 += "*";
                } else {
                    printPw += password.charAt(i);
                    // 0123456789
                    // 0 1 2 3
                    printPw2 += password.substring(i, (i+1));
                }
            }
            System.out.println(userId);
            System.out.println(printPw);
            //System.out.println(printPw2);
            System.out.println(name);
        }
    }

    public void j032() {
        String str, reverse;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        System.out.println(str);
        reverse = "";
        StringBuilder reverse2 = new StringBuilder();
        for(int i=0;i<str.length();i++){
            int tempOrder = str.length() - i - 1;
            reverse += str.charAt(tempOrder);
        }
        for(int i=str.length()-1;i>=0;i--){
            reverse2.append(str.charAt(i));
        }
        System.out.println(reverse);
        System.out.println(reverse2);
    }
}
