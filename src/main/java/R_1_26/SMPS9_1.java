package R_1_26;
class cylinder{
    int radius;
    int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public cylinder(int radius) {
        this.radius = radius;
    }

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
    public int surfacearea(){
        return radius*height;
    }
    public int volume(){
        return 4*radius*height;
    }

}
public class SMPS9_1 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder(5,6);
        //c1.height=5;
      // c1.radius=6;
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
        cylinder c3 = new cylinder(6);
    }
}
