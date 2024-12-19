package R_19_12;
class Sphere{
   private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

        public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceArea(){
        return 4*3.142*radius*radius;
    }
    public double volumeSphere(){
        return 1.33*3.142*radius*radius*radius;
    }
}
public class SMPS9_5 {
    public static void main(String[] args) {
    Sphere mySphere = new Sphere(10);
        System.out.println(mySphere.surfaceArea());
        System.out.println(mySphere.volumeSphere());
    }
}
