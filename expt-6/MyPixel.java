abstract class Point {
    int x, y;
    abstract public void display();
}
class Pixel extends Point {
    String color;
    public Pixel(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public void display() {
        System.out.println("Location: " + x + ", " + y);
        System.out.println("Color   : " + color);
    }
}
public class MyPixel {

    public static void main(String[] args) {
        Pixel p = new Pixel(50, 80, "Blue");
        p.display();
    }
}