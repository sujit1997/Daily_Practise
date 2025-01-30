package R_1_30;
class square{
    int side;
    static int area(int side){
       int areaofSquare = 0;
        return areaofSquare = side*side;
    }
    static int perimeter(int side){
        int persquare = 0;
        return persquare = 4*side;
    }
}
public class SMPS8_3 {
    public static void main(String[] args) {
        square s1 = new square();
        s1.side =3;
        System.out.println(s1.area(s1.side));
        System.out.println(s1.perimeter(s1.side));
    }
}
