package R_1_26;
class Rockstar{
   public static void hit() {
       System.out.println("hittinh");
    }

    public static void run(){
        System.out.println("running");
    }
    public static void fir(){
        System.out.println("firing");
    }

}
public class SMPS8_5 {
    public static void main(String[] args) {
        Rockstar tommyVecetti = new Rockstar();
        tommyVecetti.fir();
        tommyVecetti.hit();
        tommyVecetti.run();
    }
}
