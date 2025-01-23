package SM_1_23_Revision;
class rect3 {
    int radius;
    int height;

    public rect3(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
}
public class SMPS9_3 {
    public static void main(String[] args) {
        rect3 r3 = new rect3(5,9);
        System.out.println(r3.radius);
        System.out.println(r3.height);
    }
}
