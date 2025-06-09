package week15_hotel;

public class Hroom {
    String id; // 방의 고유 번호
    String cate; // 방 타입
    int price; // 방 1박의 가격

    public Hroom() {}
    public Hroom(String id, String cate, int price) {
        this.id = id;
        this.cate = cate;
        this.price = price;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCate() {
        return cate;
    }
    public void setCate(String cate) {
        this.cate = cate;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getId() + " " + getCate() + " " + getPrice() + "";
    }
}
