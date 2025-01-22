package R_1_22;
class Rectangle{
    int length;
    int width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return (length+width)*2;
    }
}
public class SMPS8_4 {
    public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.length = 5;
    r1.width=6;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
