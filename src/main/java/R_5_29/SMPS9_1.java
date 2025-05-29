package R_5_29;
class cylinder{
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int surfaceArea(){
        return height*radius;
    }
}
public class SMPS9_1 {
    public static void main(String[] args) {
    cylinder c1 =  new cylinder();
    c1.height = 6;
    c1.radius = 7;
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
    }
}
