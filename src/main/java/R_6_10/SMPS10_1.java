package R_6_10;
class circle{
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
class cylinder9 extends circle{

}
public class SMPS10_1 {
    public static void main(String[] args) {
        cylinder9 indian = new cylinder9();
        indian.radius = 6;
        indian.height = 7;
        System.out.println(indian.getRadius());
        System.out.println(indian.getHeight());
    }
}
