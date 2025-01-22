package R_1_22;
class square{
    int side;
    public float area(){
        return side*side;
    }
    public float perimeter(){
        return 4*side;
    }
}
public class SMPS8_3 {
    public static void main(String[] args) {
        square s1 = new square();
        s1.side = 45;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}
