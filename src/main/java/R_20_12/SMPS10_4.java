 package R_20_12;
class areaOfRectangle extends Rectangle{
    public int width;
    areaOfRectangle(int r1, int w1){
        super(r1);
        System.out.println("I am new constructor");
        this.width = w1;

    }
    public double areaOfRectangle(){
        return length*width;
    }
}

public class SMPS10_4 {
    public static void main(String[] args) {
        areaOfRectangle obj = new areaOfRectangle(12,14);
        System.out.println("Area of circle: " +obj.areaOfRectangle());

    }
}

