package R_5_9;
class rectangle{
    int height;
    int breadth;
    int length;
    public int area(int length,int breadth, int height ){
        return length*breadth*height;
    }
}
class cuboid extends rectangle{

}
public class SMPS10_2 {
    public static void main(String[] args) {
        cuboid c2 = new cuboid();
        System.out.println(c2.area(8,4,2));
    }
}
