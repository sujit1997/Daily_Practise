package R_20_12;
class Rectangle{
    public int length;
    Rectangle(int l){
        System.out.println("I am Rectangle parameterised constructor");
        this.length = l;
    }
}
class cuboid extends Rectangle{
    public int breadth;
    cuboid(int l, int b){
        super(l);
        System.out.println("I am Cuboid parameterised constructor");
        this.breadth = b;
    }

}
public class SMPS10_2 {
    public static void main(String[] args) {
        cuboid obj = new cuboid(15,7);
    }
}
