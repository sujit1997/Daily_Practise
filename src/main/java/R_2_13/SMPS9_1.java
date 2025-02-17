package R_2_13;
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
    public static float surfacearea(int radius,int height){
        return radius*height;
    }
    public static float volumeofcylinder(int radius,int height){
        return radius*height;
    }
}
public class SMPS9_1 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.setHeight(5);
        c1.setRadius(2);
        System.out.println(cylinder.surfacearea(5,2));
        System.out.println(cylinder.volumeofcylinder(6,7));
    }
}
