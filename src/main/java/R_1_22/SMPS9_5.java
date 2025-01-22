package R_1_22;
class sphere{
    private int radius;

    public sphere(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double volume(){
        return 1.33*Math.PI*(radius*radius*radius);
    }
}
public class SMPS9_5 {
    public static void main(String[] args) {
    sphere s1= new sphere(6);
        System.out.println("Volume of the sphere: " + s1.volume());
    }
}
