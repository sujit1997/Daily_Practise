package R_12_19;

class   Cylinder{
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public double surfaceArea(){
        return (2*3.142*radius*radius) + (2*3.142*radius*height);
    }
    public double volumeCylinder(){
        return 3.142*radius*radius*height;
    }

}
public class SMPS9_1 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setRadius(10);
        System.out.println(myCylinder.getRadius());
        myCylinder.setHeight(15);
        System.out.println(myCylinder.getHeight());
    }

}
