package R_1_25;
class Rect4{
public int length;
Rect4(int l){
    System.out.println("I am paramaterised constructor");
    this.length = 1;
}
}

class Cuboid extends Rect4 {
public int breadth;
Cuboid(int l, int b){
super(l);
    System.out.println("I am cuboid parameterised constructor");
this.breadth = 1;
}
}
public class SMPS10_2 {
    public static void main(String[] args) {
      Cuboid c1 = new Cuboid(6,7);

    }
}
