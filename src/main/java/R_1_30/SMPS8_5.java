package R_1_30;
class Rockstar{
    static void fire(){
        System.out.println("Fire");
    }
    static void run(){
        System.out.println("run");
    }
    static void hit(){
        System.out.println("hit");
    }
}
public class SMPS8_5 {
    public static void main(String[] args) {
        Rockstar TommyVecetti = new Rockstar();
        TommyVecetti.fire();
        TommyVecetti.run();
        TommyVecetti.hit();
    }
}
