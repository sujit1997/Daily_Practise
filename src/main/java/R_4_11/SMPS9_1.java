package R_4_11;

    class Cylinder{
        int height;
        int radius;

        public int getHeight() {
            return height;
        }

        public int getRadius() {
            return radius;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }
    }
public class SMPS9_1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.height = 56;
        c1.radius = 5;
        System.out.println(c1.getHeight());

        System.out.println(c1.getRadius());
    }
}
