package R_2_26;
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

//    public cylinder(int radius, int height) {
//        this.radius = radius;
//        this.height = height;
//
//    }
    public static int surfacearea(int radius,int height){
        return radius*height;
    }
}
public class SMPS9_1 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
//        c1.getRadius(5);
//        c1.setHeight(6);
        System.out.println(cylinder.surfacearea(6,7));
    }
}
