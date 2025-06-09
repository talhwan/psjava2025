package week15_hotel;

public class Huser {
    String id; //사용자 일련번호
    String name;
    String phone;
    String birth;

    public Huser() {}
    public Huser(String id, String name, String phone, String birth) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.birth = birth;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + getPhone() + " " + getBirth();
    }
}
