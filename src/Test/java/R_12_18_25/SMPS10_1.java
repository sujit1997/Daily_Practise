package R_12_18_25;
class circle{
    int radius;
    int area;
    public double areaOfCircle(int radius){
        return Math.PI*radius*radius;
    }
}
class cylinder3 extends circle{

}
public class SMPS10_1 {
    public static void main(String[] args) {
        cylinder3 c4 = new cylinder3();
        System.out.println(c4.areaOfCircle(6));

    }
}
