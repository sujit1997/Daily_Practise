package R_1_25;
class Rockstar {
    public void hit(){
        System.out.println("Hitting");
    }
    public void run(){
        System.out.println("Running");
    }
    public void fire(){
        System.out.println("Firing");
    }
}
public class SMPS8_5 {
    public static void main(String[] args) {
        Rockstar tommyVecetti = new Rockstar();
        tommyVecetti.hit();
        tommyVecetti.run();
        tommyVecetti.fire();
    }
}
