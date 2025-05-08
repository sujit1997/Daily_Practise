package R_5_8;
class square{
    public static void area(int side){
        System.out.println(side*side);
    }
    public static void perimeter(int side){
        System.out.println(4*side);
    }


}
public class SMPS8_3 {
    public static void main(String[] args) {
        square s1 = new square();
        int side = 3;
        s1.area(side);
        s1.perimeter(side);
    }
}
