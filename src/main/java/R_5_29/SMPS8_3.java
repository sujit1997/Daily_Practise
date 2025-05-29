package R_5_29;
class square{
    int side;
    public int area(){
        return side*side;
    }
    public float perimeter(){
        return 4*side;
    }
}
public class SMPS8_3 {
    public static void main(String[] args) {
        square s1 = new square();
        s1.side = 4;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}
