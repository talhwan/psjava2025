package week13;

import java.text.SimpleDateFormat;
import java.util.*;

public class CarManager {
    Map<String, Car> map = null;

    public CarManager(){
        map = new HashMap<String, Car>();
    }
    public Car getCar(String no){
        return map.get(no);
    }
    public Date getNow(){
        Date nowDate = new Date();
        SimpleDateFormat simpleDateFormat = null;
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(nowDate));
        return nowDate;
    }
    public Date getNow2(){
        Date nowDate = new Date();
        nowDate.setHours(nowDate.getHours()+2);
        SimpleDateFormat simpleDateFormat = null;
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(nowDate));
        return nowDate;
    }
    public void startCar(String no){
        Car car = map.get(no);
        if(car == null){
            car = new Car(no, getNow());
            map.put(car.getNo(), car);
        } else {
            if(car.isIn()){
                System.out.println(car.getNo() + "는 주차중인데요?");
            } else {
                System.out.println(car.getNo() + " 다시 주차 원하시는군요..");
                /*car.setStart(null);
                car.setFinish(null);*/

                car = new Car(no, getNow());
                map.put(car.getNo(), car);
            }
        }
    }
    public void finishCar(String no){
        Car car = map.get(no);
        car.setFinish(getNow2());
    }
    public void printAll(){
        Set<String> keys = map.keySet();
        for(String key : keys){
            Car car = map.get(key);
            System.out.println(car);
        }
    }

    public static void main(String[] args) {
        CarManager cm = new CarManager();
        cm.startCar("7938");
        cm.startCar("4579");
        cm.startCar("9283");
        cm.startCar("8670");

        cm.startCar("7938");
        cm.finishCar("7938");

        System.out.println(cm.getCar("7938").getPrice());
        cm.startCar("7938");

        cm.printAll();

    }


}
