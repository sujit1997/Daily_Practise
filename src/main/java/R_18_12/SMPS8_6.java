package R_18_12;

class Circle{
    int r;

    public int area(){
        return (int) (3.14*r*r);
    }
    public int perimeter(){
        return (int) (2*3.14*r);
    }
}
public class SMPS8_6 {
    public static void main(String[] args) {
     Circle cl = new Circle();
     cl.r = 6;
        System.out.println(cl.area());
        System.out.println(cl.perimeter());

    }
}
