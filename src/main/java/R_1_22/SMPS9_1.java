package R_1_22;
class Cylinder{
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
    public double surfacearea(){
        return 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*(radius*radius)*height;
    }
}

public class SMPS9_1 {
    public static void main(String[] args) {
        Cylinder c1= new Cylinder();
        c1.height= 5;
        c1.radius= 7;
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
    }
}
