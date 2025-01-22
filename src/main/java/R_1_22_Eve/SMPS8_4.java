package R_1_22_Eve;
class Rectangle{
    int length;
    int height;
    public int area(){
        return length*height;
    }
}
public class SMPS8_4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 4;
        r1.height = 5;
        System.out.println(r1.area());
    }
}
