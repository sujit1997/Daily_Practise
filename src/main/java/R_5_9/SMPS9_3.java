package R_5_9;
class cylinder2 {
    int radius;
    int height;

    public cylinder2(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public cylinder2(int radius) {
        this.radius = radius;
    }
}
public class SMPS9_3 {
    public static void main(String[] args) {
        cylinder2 c2 = new cylinder2(5,9);
        System.out.println(c2.radius);
        System.out.println(c2.height);
        cylinder2 c3 = new cylinder2(4);
        System.out.println(c3.radius);
    }
}
