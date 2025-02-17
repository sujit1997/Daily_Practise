package R_2_13;
class circle{
    public int side;
    int radius;
    public int areaofcircle(int side){
        return side*side;
    }
}
class cylinder4 extends circle{

}
public class SMPS10_1 {
    public static void main(String[] args) {
        circle c6 = new circle();
        c6.side = 6;
        System.out.println(c6.areaofcircle(6));
        ;
    }
}
