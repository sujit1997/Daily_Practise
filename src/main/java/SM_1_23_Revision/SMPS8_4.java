package SM_1_23_Revision;
class Rect{
    int length;
    int width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}
public class SMPS8_4 {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        r1.length = 4;
        r1.width = 6;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
