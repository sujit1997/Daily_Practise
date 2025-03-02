package R_3_2;
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
    public static void surfacearea(int radius){
        System.out.println(3.142*radius);
    }
    public static void volume(int radius, int height){
        System.out.println(3.142*radius*height);
    }
}
public class SMPS9_1 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.radius = 5;
        c1.height = 10;
        c1.surfacearea(c1.radius);
        c1.volume(c1.radius,c1.height);
    }
}
