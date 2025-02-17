package R_2_13;
class cylinder3{
    int height;
    int radius;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public cylinder3(int height) {
        this.height = height;
    }

    public cylinder3(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }
}
public class SMPS9_4 {
    public static void main(String[] args) {
        cylinder3 c3 = new cylinder3(6);
        System.out.println(c3.getHeight());
        cylinder3 c4 = new cylinder3(2,7);
    }
}
