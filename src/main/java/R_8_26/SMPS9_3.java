package R_8_26;
class cylinder2 {
    int radius;
    int height;
    public cylinder2(int radius, int height){
        this.height = height;
        this.radius = radius;
    }
}
public class SMPS9_3 {
    public static void main(String[] args) {
        cylinder2 c2 = new cylinder2(5,9);
        System.out.println(c2.height);
        System.out.println(c2.radius);
    }
}
