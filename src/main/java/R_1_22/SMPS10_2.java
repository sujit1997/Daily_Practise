package R_1_22;
class rect7{
    public int length;

    public rect7(int length) {
        this.length = length;
    }
}
class cuboid extends rect7{
    public int breadth;

    public cuboid(int length, int breadth) {
        super(length);
        this.breadth = breadth;
    }
}
public class SMPS10_2 {
    public static void main(String[] args) {
    cuboid c1 = new cuboid(5,6);
    }
}
