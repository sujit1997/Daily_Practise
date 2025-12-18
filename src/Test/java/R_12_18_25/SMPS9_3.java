package R_12_18_25;
class cylinder2 {
    int radius;
    int height;

    public cylinder2(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
}
public class SMPS9_3 {
    public static void main(String[] args) {
        cylinder2 c3 =  new cylinder2(6,8);
        System.out.println(c3.height);
        System.out.println(c3.radius);
    }
}
