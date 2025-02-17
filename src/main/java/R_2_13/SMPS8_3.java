package R_2_13;
class square{
    int side;
    public static int area(int side){
        return  side*side;
    }
    public static int perimeter(int side){
        return  4*side;
    }
}
public class SMPS8_3 {
    public static void main(String[] args) {
        square s1 = new square();
        s1.side = 3;
        System.out.println(s1.area(s1.side));
        System.out.println(s1.perimeter(s1.side));
    }
}
