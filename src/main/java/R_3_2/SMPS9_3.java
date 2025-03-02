package R_3_2;
class cylinder2{
    int radius;
    int height;

    public cylinder2(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class SMPS9_3 {
    public static void main(String[] args) {
        cylinder2 c2 = new cylinder2(5,6);
        System.out.println(c2.getHeight());
        System.out.println(c2.getRadius());

    }
}
