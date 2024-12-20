package R_20_12;
class circle{
    public int radius;
    circle(int r){
        System.out.println("I am circle Parameterised constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class cylinder extends circle{
    public int height;
    cylinder(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterised constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class SMPS10_1 {
    public static void main(String[] args) {
        //circle objc = new circle(12);
        //a.radius(5);

        cylinder obj = new cylinder(12,4);
        //b.radius();
    }
}
