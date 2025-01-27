package R_1_26;
class square{
    int side;
    public  int area(int side){
        return side*side;
    }
    public int  perimeter(int side){
        return 4*side;
    }
}
public class SMPS8_3 {
    public static void main(String[] args) {
        square s1 = new square();
        s1.side = 5;
        System.out.println(s1.area(5));
        System.out.println(s1.perimeter(5));
    }
}
