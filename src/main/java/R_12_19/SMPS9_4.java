package R_12_19;

class Rectangle{
private int length;
private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = 4;
        this.breadth = 5;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
}
public class SMPS9_4 {
    public static void main(String[] args) {
    Rectangle r = new Rectangle(12,15);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
