package R_12_18_25;
class rectangle{
    int length;
    int breadth;

    public rectangle(int length) {
        this.length = length;
        System.out.println(length);
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println(length);
        System.out.println(breadth);
    }
}
public class SMPS9_4 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(5);
        //rectangle r2 = new rectangle(6,7);
    }
}
