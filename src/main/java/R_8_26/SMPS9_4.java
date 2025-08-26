package R_8_26;
class rectangle3 {
    int length;
    int width;
    public rectangle3(int length){
        this.length = length;
    }
    public rectangle3(int length,int width){
        this.length = length;
        this.width = width;
    }
}
public class SMPS9_4 {
    public static void main(String[] args) {
        rectangle3 r3 = new rectangle3(6,7);
        System.out.println(r3.length);
        System.out.println(r3.width);
    }
}
