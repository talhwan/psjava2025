package week15_book;

import java.util.ArrayList;
import java.util.List;

public class JrentManagerImpl implements JrentManager {

    List<Jrent> rents = null;

    public JrentManagerImpl() {
        this.rents = new ArrayList<>();
        FileIO fileIO = new FileIO();
        String tempRents = fileIO.in("rents");

        if(tempRents == null || tempRents.isEmpty()){
        } else {
            //이제 데이터 불러올꺼임!
            System.out.println(tempRents);
            String[] rentsArray = tempRents.split("\n");
            for(String each : rentsArray){
                String[] eachArray = each.split("\t");
                String endDate = eachArray[4];
                if(endDate.isEmpty() || "null".equals(endDate)){
                    endDate = null;
                }
                Jrent rent = new Jrent(eachArray[0], eachArray[1], eachArray[2] , eachArray[3], endDate);
                this.rents.add(rent);
            }
        }
    }
    @Override
    public List<Jrent> getList() {
        return rents;
    }
    @Override
    public void add(Jrent rent) {
        if(isAvailable(rent.getBookId())){
            rents.add(rent);
            save();
        }
    }

    @Override
    public void done(String bookId) {
        Jrent tempRent = null;
        for(Jrent each : rents){
            if(each.getBookId().equals(bookId)){
                tempRent = each;
            }
        }
        if(tempRent == null){
            System.out.println("Book not found");
        } else {
            tempRent.done();
            save();
        }
    }

    public void save(){
        FileIO fileIO = new FileIO();
        StringBuilder rentsString = new StringBuilder();
        for(Jrent each : rents){
            rentsString.append(each.toString()).append("\n");
        }
        fileIO.out("rents", rentsString.toString());
    }

    public boolean isAvailable(String bookId){
        Jrent tempRent = null;
        for(Jrent each : rents){
            if(each.getBookId().equals(bookId)){
                tempRent = each;
            }
        }
        if(tempRent == null){
            return true;
        } else {
            return (tempRent.isReturned());
        }
    }
}
