package R_18_12;
class Rectangle{
    int length;
    int width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}
public class SMPS8_4 {
    public static void main(String[] args) {
    Rectangle re = new Rectangle();
    re.length = 4;
    re.width = 6;
        System.out.println(re.area());
        System.out.println(re.perimeter());
    }
}
