package R_1_31;

interface cuboid{
    public void length();
    public void width();
}
class Rectangle implements cuboid {

    @Override
    public void length() {
        System.out.println("THIS IS MESSAGE 1");
    }

    @Override
    public void width() {
        System.out.println("THIS IS MESSAGE 2");
    }

}
public class SMPS10_2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length();
        r1.width();
        int radius= 5;


    }
}
