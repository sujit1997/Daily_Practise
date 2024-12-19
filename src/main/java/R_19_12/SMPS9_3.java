package R_19_12;

class Cylinder2{
    private int radius;
    private int height;

    public Cylinder2(int height, int radius) { // COnstructor generate
        this.height = height;
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }

}
public class SMPS9_3 {
    public static void main(String[] args) {
        Cylinder2 myCylinder = new Cylinder2(12,9);
        //myCylinder.setRadius(10);
        System.out.println(myCylinder.getRadius());
        //myCylinder.setHeight(15);
        System.out.println(myCylinder.getHeight());
    }

}
