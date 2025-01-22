package R_1_22;
class circle3{
    public int radius;

    public circle3(int radius) {
        this.radius = radius;
    }
    public int area(){
        return radius*radius;
    }
    public int volume(){
        return radius*radius*radius;
    }
}
public class SMPS10_3 {
    public static void main(String[] args) {
    circle3 c3 = new circle3(6);
    c3.area();
        System.out.println(c3.area());

    }
}
