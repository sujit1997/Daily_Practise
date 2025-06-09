package R_6_10;
class plane2{
   private int length;
   private int width;
   public plane2(int length){
       this.length = length;
   }
   public plane2(int length,int width){
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
public class SMPS9_3 {
    public static void main(String[] args) {
        plane2 air = new plane2(5);
        System.out.println(air.getLength());
        plane2 bigair = new plane2(4,5);
        System.out.println(bigair.getLength());
        System.out.println(bigair.getWidth());
    }
}
