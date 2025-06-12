package week15_book;

import java.util.ArrayList;
import java.util.List;

public class JuserManagerImpl implements JuserManager {

    List<Juser> users = null;

    public JuserManagerImpl() {
        this.users = new ArrayList<>();
        FileIO fileIO = new FileIO();
        String tempUsers = fileIO.in("users");

        if(tempUsers == null || tempUsers.isEmpty()){
        } else {
            //이제 데이터 불러올꺼임!
            System.out.println(tempUsers);
            String[] usersArray = tempUsers.split("\n");
            for(String each : usersArray){
                String[] eachArray = each.split("\t");
                Juser user = new Juser(eachArray[0], eachArray[1], eachArray[2], eachArray[3], eachArray[4]);
                this.users.add(user);
            }
        }
    }
    public List<Juser> getList() {
        return users;
    }
    public void add(Juser user) {
        String tempUid = user.getUid();
        boolean found = false;
        for(Juser each : users){
            if(each.getUid().equals(tempUid)){
                found = true;
            }
        }
        if(!found){
            users.add(user);
            save();
        }
    }

    public void save(){
        FileIO fileIO = new FileIO();
        StringBuilder usersString = new StringBuilder();
        for(Juser each : users){
            usersString.append(each.toString()).append("\n");
        }
        fileIO.out("users", usersString.toString());
    }
}
