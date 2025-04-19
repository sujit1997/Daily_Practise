package R_4_11;
class cylinder2{
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double  surfacearea(){
        return radius*height;
    }
    public double volume(){
        return 3.14*radius;
    }
}

public class SMPS9_2 {
    public static void main(String[] args) {
        cylinder2 c2 = new cylinder2();
        c2.height = 15;
        c2.radius = 10;
        System.out.println(c2.surfacearea());
        System.out.println(c2.volume());
    }
}
