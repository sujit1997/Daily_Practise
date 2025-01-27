package R_1_27;
class Circle{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public double areaofcircle(int radius){
        return Math.PI*radius*radius;
    }
}
class Cylinder extends Circle{

    public Cylinder(int radius) {
        super(radius);
    }
}
public class SMPS10_1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(6);


    }
}
