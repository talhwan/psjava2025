package week15_hotel;

import java.util.ArrayList;
import java.util.List;

public class HroomManagerImpl implements HroomManager {
    List<Hroom> hrooms = null;

    public HroomManagerImpl() {
        init();
    }

    public void init(){
        hrooms = new ArrayList<>();
        FileIO fileIO = new FileIO();
        String hroomString = fileIO.in("hroom");
        if(hroomString == null || hroomString.isEmpty()){
        } else {
            String[] tempArr = hroomString.split("\n");
            for(String each : tempArr){
                String[] arr = each.split(" ");
                hrooms.add(new Hroom(arr[0], arr[1], Integer.parseInt(arr[2])));
            }
        }
    }
    public void add(Hroom hroom){
        boolean found = false;
        String tempId = hroom.getId();
        for(Hroom each : hrooms){
            if(tempId.equals(each.getId())){
                found = true;
            }
        }
        if(!found){
            hrooms.add(hroom);
        }
        fileOut();
    }
    public void fileOut(){
        String hroomString = "";
        for(Hroom each : hrooms){
            hroomString += each.toString() + "\n";
        }
        FileIO fileIO = new FileIO();
        fileIO.out("hroom", hroomString);
    }
}
