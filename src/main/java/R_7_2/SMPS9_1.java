package R_7_2;
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
}

public class SMPS9_1 {
    public static void main(String[] args) {
    cylinder hallo = new cylinder();
    hallo.radius = 6;
    hallo.height = 7;
        System.out.println(hallo.radius);
        System.out.println(hallo.height);
        System.out.println(hallo.surfacearea(6, 7));
    }

}
