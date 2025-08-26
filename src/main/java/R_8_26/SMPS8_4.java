package R_8_26;
class rectangle{
    int length;
    int width;
    public int area(){
        return length*width;
    }
}
public class SMPS8_4 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.length = 5;
        r1.width = 6;
        System.out.println(r1.area());

    }
}
