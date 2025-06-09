package week15_hotel;

import java.util.ArrayList;
import java.util.List;

public class HuserManagerImpl implements HuserManager {
    List<Huser> husers = null;

    public HuserManagerImpl() {
        init();
    }

    public void init(){
        husers = new ArrayList<>();
        FileIO fileIO = new FileIO();
        String huserString = fileIO.in("huser");
        if(huserString == null || huserString.isEmpty()){
        } else {
            String[] tempArr = huserString.split("\n");
            for(String each : tempArr){
                String[] arr = each.split(" ");
                husers.add(new Huser(arr[0], arr[1], arr[2], arr[3]));
            }
        }
    }
    public void add(Huser huser){
        boolean found = false;
        String tempId = huser.getId();
        for(Huser each : husers){
            if(tempId.equals(each.getId())){
                found = true;
            }
        }
        if(!found){
            husers.add(huser);
        }
        fileOut();
    }
    public void fileOut(){
        String huserString = "";
        for(Huser each : husers){
            huserString += each.toString() + "\n";
        }
        FileIO fileIO = new FileIO();
        fileIO.out("huser", huserString);
    }
}
