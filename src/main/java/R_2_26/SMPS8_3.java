package R_2_26;
class square{
    int side;
    float area;
    float perimeter;
    public static int AreaofSquare(int side){
        return side*side;
    }
    public static int perimeterofSquare(int side){
        return  4*side*side;
    }
}
public class SMPS8_3 {
    public static void main(String[] args) {
        square s1 = new square();
        s1.side = 4;
        System.out.println(s1.AreaofSquare(s1.side));
        System.out.println(s1.perimeterofSquare(s1.side));
    }
}
