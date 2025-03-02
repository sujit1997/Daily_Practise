package R_3_2;
class circle{
    int radius;
    int length;
    int breadth;
    public static void areaofcircle(int radius){
        System.out.println(radius*radius);
    }
}
class cylinder3 extends circle{
    public static void areaofcylinder(int radius){
        System.out.println(3.142*radius*radius);
    }
    public void volumeofcylinder(int radius, int length, int breadth){
        System.out.println(3.142*radius*length*breadth);
    }
}
public class SMPS10_1 {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.radius = 5;
        c1.areaofcircle(5);
        cylinder3 c3 = new cylinder3();
        c3.areaofcylinder(6);
    }
}
