package SM_1_23_Revision;
class circle{
    int radius;
    public double area(){
        return 3*Math.PI*radius;
    }
}
class cylinder2 extends circle {

}
public class SMPS10_1 {
    public static void main(String[] args) {
        cylinder2 c2 = new cylinder2();
        c2.radius = 4;
        System.out.println(c2.area());
    }
}
