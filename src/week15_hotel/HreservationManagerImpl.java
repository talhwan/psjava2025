package week15_hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class HreservationManagerImpl implements HreservationManager {
    List<Hreservation> hreservations = null;

    public HreservationManagerImpl() {
        init();
    }

    public void init(){
        hreservations = new ArrayList<>();
        FileIO fileIO = new FileIO();
        String hreservationString = fileIO.in("hreservation");
        if(hreservationString == null || hreservationString.isEmpty()){
        } else {
            String[] tempArr = hreservationString.split("\n");
            for(String each : tempArr){
                String[] arr = each.split(" ");
                String stringIsPaid = arr[5];
                boolean isPaid = "true".equals(stringIsPaid);
                hreservations.add(new Hreservation(arr[0], arr[1], arr[2], arr[3], arr[4], isPaid));
            }
        }
    }
    public void add(Hreservation hreservation){
        boolean found = false;
        String tempId = hreservation.getId();
        for(Hreservation each : hreservations){
            if(tempId.equals(each.getId())){
                found = true;
            }
        }
        boolean isAvailable = true;
        //시작일 부터 종료일 전날까지 확인을 해봐야 합니다!!
        String tempDate1 = hreservation.getStartDate();
        String tempDate2 = hreservation.getEndDate();
        int tempTerm = getTerm(tempDate1, tempDate2);
        for(int i=0;i<tempTerm;i++){
            String rentDate = addDate(tempDate1, i);
            System.out.println("rentDate : " + rentDate);
            //입력일 기준으로, 현재 해당 객실이 대여되어있는지 확인할것!!
            for(Hreservation each : hreservations){
                String roomId = each.getRoomId();
                if(roomId.equals(hreservation.getRoomId())){
                    String startdate = each.getStartDate();
                    String enddate = each.getEndDate();
                    String now = rentDate;

                    String temp0 = startdate.replaceAll("-","");
                    String temp1 = enddate.replaceAll("-","");
                    String tempNow = now.replaceAll("-","");
                    if(Integer.parseInt(temp0) <= Integer.parseInt(tempNow) // 시작일 보다 오늘이 더 뒤에 있고
                            && Integer.parseInt(temp1) >= Integer.parseInt(tempNow) // 종료일 보다 오늘이 더 앞에 있는 경우
                    ){
                        isAvailable = false;
                    }
                }

            }
        }

        if(!found && isAvailable){
            hreservations.add(hreservation);
            fileOut();
        } else {
            System.out.println("nono...");
        }
    }
    public void fileOut(){
        String hreservationString = "";
        for(Hreservation each : hreservations){
            hreservationString += each.toString() + "\n";
        }
        FileIO fileIO = new FileIO();
        fileIO.out("hreservation", hreservationString);
    }

    public String getNow(int addDate){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, addDate);
        Date date = new Date(calendar.getTimeInMillis());
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    public int getTerm(String sDate, String fDate) {
        try{
            Date format1 = new SimpleDateFormat("yyyy-MM-dd").parse(fDate);
            Date format2 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate);

            long diffSec = (format1.getTime() - format2.getTime()) / 1000; //초 차이
            long diffDays = diffSec / (24*60*60); //일자수 차이

            //System.out.println(diffSec + "초 차이");
            //System.out.println(diffDays + "일 차이");

            return (int) diffDays;
        } catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    public String addDate(String nowDate, int addDate) {
        try{
            SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date tempDate = transFormat.parse(nowDate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(tempDate);

            calendar.add(Calendar.DATE, addDate);

            Date date = new Date(calendar.getTimeInMillis());
            return new SimpleDateFormat("yyyy-MM-dd").format(date);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
