package R_4_11;
class Rectangle{
    int length;
    int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }
}
class cuboid extends Rectangle{
    int width;

    public cuboid(int length, int height, int width) {
        super(length, height);
        this.width = width;
    }
}
public class SMPS10_2 {
    public static void main(String[] args) {
        cuboid c1 = new cuboid(6,4,2);
        System.out.println(c1.height);

    }
}
