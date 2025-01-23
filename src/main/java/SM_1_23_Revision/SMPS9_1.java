package SM_1_23_Revision;
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
    public int surfacearea(){
        return radius*height;
    }
    public double volume(){
        return 4*Math.PI*radius*height;
    }
}
public class SMPS9_1 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.height = 5;
        c1.radius = 7;
        System.out.println(c1.height);
        System.out.println(c1.radius);
    }
}
