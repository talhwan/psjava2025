public class Car {
    private int speed;
    private String color;

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public void print(){
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
    }
}
