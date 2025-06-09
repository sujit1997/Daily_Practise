package R_6_10;
class plane{
    private int length;
    private int width;
    public plane(int length){
        this.length = length;
    }
    public plane(int length,int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
public class SMPS9_4 {
    public static void main(String[] args) {
        plane air = new plane(5);
        System.out.println(air.getLength());
        plane bigair = new plane(4,5);
        System.out.println(bigair.getLength());
        System.out.println(bigair.getWidth());
    }
}
