package R_1_27;
class rectangle{
    int radius;

    public rectangle(int radius) {
        this.radius = radius;
    }
}
class cuboid extends rectangle{

    public cuboid(int radius) {
        super(radius);
    }
}
public class SMPS10_2 {
    public static void main(String[] args) {
        cuboid c1 = new cuboid(6);
    }
}
