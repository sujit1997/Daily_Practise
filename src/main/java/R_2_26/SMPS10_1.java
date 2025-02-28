package R_2_26;
class circle{
    int radius ;
    public void give(){System.out.println("Display message");}
    public static int area(int side){return side*side;}
}
class cylinder2 extends circle{

}
public class SMPS10_1 {
    public static void main(String[] args) {
        cylinder2 c2 = new cylinder2();
        c2.give();
        int side = 5;
        c2.area(side);
        System.out.println(c2.area(6));
    }
}
