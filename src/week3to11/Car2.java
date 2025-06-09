package week3to11;

public class Car2 {
    private String productNumber;
    private int price;
    private String color;
    private int speed;

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }
    public String getProductNumber() {
        return productNumber;
    }

    public void printAll() {
        System.out.println("Product Number: " + productNumber);
        System.out.println("price: " + price);
        System.out.println("color: " + color);
        System.out.println("speed: " + speed);
    }
}
