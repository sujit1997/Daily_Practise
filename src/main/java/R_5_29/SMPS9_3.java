package R_5_29;
class cylinder2 {
    int height;
    int radius;
    public int surfacearea1(int radius, int height){
        return radius* height;
    }
}
public class SMPS9_3 {
    public static void main(String[] args) {
        cylinder2 c2 = new cylinder2();

        System.out.println(c2.surfacearea1(6,7));
    }
}
