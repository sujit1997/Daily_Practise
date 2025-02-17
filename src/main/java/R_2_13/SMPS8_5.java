package R_2_13;
class Rockstar{
    public static void hit(){
        System.out.println("Hitting");
    }
    public static void run(){
        System.out.println("Running");
    }
    public static void fire(){
        System.out.println("Firing");
    }
}
public class SMPS8_5 {
    public static void main(String[] args) {
        Rockstar tommyVecetti = new Rockstar();
        tommyVecetti.hit();
        tommyVecetti.fire();
        tommyVecetti.run();
    }
}
