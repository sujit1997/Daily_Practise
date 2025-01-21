package R_12_20;
class areaOfCircle extends circle{

   areaOfCircle(int r1){
       super(r1);
       System.out.println("I am new constructor");

   }
    public double areaOfCircle(){

        return Math.PI*radius*radius;
    }
}
class volumeOfCircle extends circle{
    public int height;
    volumeOfCircle(int r1, int h){
        super(r1);
        System.out.println("I am new constructor on volume of circle");
        this.height = h;
    }
    public double volumeOfCircle(){
        return Math.PI*radius*radius*height;
    }

}

public class SMPS10_3 {
    public static void main(String[] args) {
        areaOfCircle obj = new areaOfCircle(12);
        System.out.println("Area of circle: " +obj.areaOfCircle());
        volumeOfCircle obj2 = new volumeOfCircle(12,4);
        System.out.println("Volume of circle " +obj2.volumeOfCircle());
    }
}
