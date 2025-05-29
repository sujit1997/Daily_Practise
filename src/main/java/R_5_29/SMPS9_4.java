package R_5_29;
class square2{
    int height;
    int width;
    public square2(int height,int width){
        this.height = height;
        this.width = width;
    }

    public square2(int height){
        this.height = height;
    }

}
public class SMPS9_4 {
    public static void main(String[] args) {
        square2 c2 = new square2(6);
        System.out.println(c2.height);
    }
}
