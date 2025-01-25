package R_1_25;
class Cylinder3 {
    int radius;
    int height;

    public Cylinder3(int radius) {
        this.radius = radius;
    }

    public Cylinder3(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

}
public class SMPS9_4 {
    public static void main(String[] args) {
        Cylinder3 c3 = new Cylinder3(6,7);
        Cylinder3 c4 = new Cylinder3(6);
    }
}
