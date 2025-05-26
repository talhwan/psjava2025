package week13;

import java.util.Date;

public class Car {
    private String no;
    private Date start;
    private Date finish;

    public Car(String no, Date start) {
        this.no = no;
        this.start = start;
        this.finish = null;
    }

    public void setNo(String no) {
        this.no = no;
    }
    public String getNo() {
        return no;
    }
    public void setStart(Date start) {
        this.start = start;
    }
    public Date getStart() {
        return start;
    }
    public void setFinish(Date finish) {
        this.finish = finish;
    }
    public Date getFinish() {
        return finish;
    }

    public int getDiffMinute(){
        if(isIn()){
            //주차중이니까, 일단 최대값 리턴
            return -1;
        }

        int dif = (int) ((finish.getTime()-start.getTime()) / (60*1000));
        return dif;
    }
    public int getPrice(){
        int tempPrice = 500; // 10분에 500원
        int dif = getDiffMinute();
        if(dif != -1){
            if(dif <= 10){
                return 0;
            } else {
                int tempMinute = dif - 10;
                int tempAmount = tempMinute / 10;
                if(tempMinute % 10 > 0){
                    tempAmount++;
                }
                return tempAmount * tempPrice;
            }
        } else {
            return -1;
        }
    }

    public boolean isIn(){
        /*if(finish == null){
            return true;
        } else {
            return false;
        }*/
        return (finish == null);
    }

    @Override
    public String toString(){
        return no + "\t" + start + "\t" + finish + "\t" + isIn() + "\t" + getDiffMinute() + "\t" + getPrice();
    }
}
