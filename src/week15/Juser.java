package week15;

public class Juser {
    String uid; // 학번
    String name;
    String phone;
    String birth;
    String gender;

    public Juser() {}
    public Juser(String uid, String name, String phone, String birth, String gender) {
        this.uid = uid;
        this.name = name;
        this.phone = phone;
        this.birth = birth;
    }

    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
