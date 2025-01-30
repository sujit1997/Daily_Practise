package R_1_30;
class Cylinder{
    int radius;
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int surfacearea(int radius, int height){
        return radius*height;
    }
}
public class SMPS9_1 {
    public static void main(String[] args) {
        Cylinder hollo = new Cylinder();
        hollo.height = 5;
        hollo.radius = 3;
        System.out.println(hollo.getHeight());
        System.out.println(hollo.getRadius());


    }
}
