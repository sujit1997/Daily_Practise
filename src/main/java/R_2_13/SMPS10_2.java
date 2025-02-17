package R_2_13;
class Rectangle{
    int side;

    public Rectangle(int side) {
        this.side = side;
    }
}
class cuboid extends Rectangle {

    public cuboid(int side) {
        super(side);
    }
}
public class SMPS10_2 {
    public static void main(String[] args) {
        cuboid c1 = new cuboid(6);
    }
}
