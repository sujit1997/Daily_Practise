package SM_1_23_Revision;
class rect4 {
    int radius;
    int height;

    public rect4(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public rect4(int radius) {
        this.radius = radius;
    }
}
public class SMPS9_4 {
    public static void main(String[] args) {
        rect4 r4 = new rect4(5);
        System.out.println(r4.radius);

    }
}
