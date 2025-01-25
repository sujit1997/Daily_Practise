package R_1_25;
class Circle{
    public int radius;
    public Circle(int r){
        System.out.println("I am parameterised constructor");
        this.radius =r;
    }
public double area(){
return Math.PI*this.radius*this.radius;
}
}
class Cylinder extends Circle{
public int height;
Cylinder(int r, int h) {
        super(r);
        this.height= h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class SMPS10_1 {
    public static void main(String[] args) {
        Circle z1 = new Circle(5);

    }
}
