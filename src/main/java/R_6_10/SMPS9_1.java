package R_6_10;
class cylinder{
    int radius;
    int height;

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
    public static double surfacearea(int radius){
        return 3* Math.PI * radius;
    }
}
public class SMPS9_1 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.setHeight(15);
        c1.setRadius(2);
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
    }
}
