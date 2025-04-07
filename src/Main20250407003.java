import java.util.Scanner;

public class Main20250407003 {
    public static void main(String[] args) {
        Main20250407003 ps = new Main20250407003();
        //ps.test();
        //ps.j032();
        Car car = new Car();
        Car car1 = new Car();
        car.setSpeed(100);
        car1.setSpeed(101);
        car.setColor("black");
        car1.setColor("red");
        car.print();
        car1.print();
    }

    public void test(){
        String aaa = "";
        aaa = "0123456789";
        System.out.println(aaa.length()); // 10
        System.out.println(aaa.substring(0, 5)); // 01234
        System.out.println(aaa.substring(5, 7)); // 56

        String bbb = "0123456789";
        boolean ab = aaa.equals(bbb);

        System.out.println("ab : " + ab);
    }
    public void practice01(){
        /*
        00:00~23:59
        3이라는 숫자가 있을때 총 분!!
        * */
        int count = 0;
        int count1 = 0;
        for(int i=0;i<=23;i++){
            //시!!
            for(int j=0;j<=59;j++){
                //분
                //String time = i + ":" + j;
                String time = make2digit(i) + ":" + make2digit(j);
                //System.out.println(time);
                if(time.contains("3")){
                    //System.out.println(time);
                    count++;
                }
                if(time.indexOf("3") != -1){
                    //System.out.println(time);
                    count1++;
                }
            }
        }
        System.out.println(count);
        System.out.println(count1);
    }
    public String make2digit(int num){
        String result = num + "";
        if(num < 10){
            result = "0" + num;
        }
        return result;
    }

    public void j031() {
        String id, pw, name;
        Scanner in = new Scanner(System.in);
        id = in.nextLine();
        pw = in.nextLine();
        name = in.nextLine();

        if(pw.length() < 4){
            System.out.print("error pw short");
        } else {
            String printPw = pw.substring(0,3);
            for(int i=3;i<pw.length();i++){
                printPw += "*";
            }
            String printPw2 = "";
            for(int i=0;i<pw.length();i++){
                if(i < 3){
                    //printPw2 += pw.charAt(i);
                    printPw2 += pw.substring(i,(i+1));
                } else {
                    printPw2 += "*";
                }
            }
            System.out.println(id);
            System.out.println(printPw);
            System.out.println(printPw2);
            System.out.println(name);
        }
    }

    public void j032() {
        String str, reverse;
        Scanner in = new Scanner(System.in);
        str = in.nextLine();

        reverse = "";
        for(int i=0;i<str.length();i++){
            int j = str.length() - i - 1;
            reverse += str.substring(j, (j+1));
        }

        System.out.println(str);
        System.out.println(reverse);
    }
}

