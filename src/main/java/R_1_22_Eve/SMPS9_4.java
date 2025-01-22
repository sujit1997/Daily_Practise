package R_1_22_Eve;
class cylinder3{
    int radius;
    int height;

    public cylinder3(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public cylinder3(int radius) {
        this.radius = radius;
    }
}
public class SMPS9_4 {
    public static void main(String[] args) {
        cylinder3 c3 = new cylinder3(6,7);
        cylinder3 c4 = new cylinder3(6);


    }
}
