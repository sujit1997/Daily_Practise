package R_4_11;
class cylinder4{
    int height;
    int radius;

    public cylinder4(int height) {
        this.height = height;
    }

    public cylinder4(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }
}
public class SMPS9_4 {
    cylinder4 c4 = new cylinder4(5);
    cylinder4 c5 = new cylinder4(6,7);
}
