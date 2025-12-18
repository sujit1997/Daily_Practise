package R_12_18_25;
class square{
    int side;
    public int area(){
         return side * side;
    }
    public int perimeter(){
        return  4*side;
    }
}
public class SMPS8_3 {
    public static void main(String[] args) {
        square s1 = new square();
        s1.side = 20;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());



    }
}
