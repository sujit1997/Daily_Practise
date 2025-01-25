package R_1_25;
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
    public double surfacearea(int height, int radius){
        return 4*Math.PI*radius;
    }
    public  double volume(int height, int radius){
        return height*radius;
    }
}
public class SMPS9_1 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.radius = 3;
        c1.height = 5;
        System.out.println(c1.getRadius());
        System.out.println(c1.getHeight());
    }
}
