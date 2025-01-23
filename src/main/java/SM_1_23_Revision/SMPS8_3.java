package SM_1_23_Revision;
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class SMPS8_3 {
    public static void main(String[] args) {
        square s1 = new square();
        s1.side = 3;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}