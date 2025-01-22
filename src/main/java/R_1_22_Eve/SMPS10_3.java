package R_1_22_Eve;
class circle10_3{
    public int radius;

    public circle10_3(int radius) {
        this.radius = radius;
    }
}
class cylinder10_3 extends circle10_3{
    public int  diameter;

    public cylinder10_3(int radius) {
        super(radius);
    }
    public double areaofvolume(){
              return  4 * Math.PI * radius;
    }
}
public class SMPS10_3 {
    public static void main(String[] args) {

    }
}
