package R_1_25;
class areaofcircle extends Circle{
areaofcircle(int r){
super(r);
    System.out.println("I am new Constructor");
}
public double areaofcircle(){
return Math.PI*radius*radius;
}
}
public class SMPS10_3 {
    public static void main(String[] args) {
    areaofcircle obj =new areaofcircle(6);
        System.out.println("Area of circle" +obj.areaofcircle());
    }
}
