package R_3_2;
class rockstar{
    public static void hit(){
        System.out.println("hitting");
    }
    public static void run(){
        System.out.println("running");
    }
    public static void fire(){
        System.out.println("firing");
    }
}
public class SMPS8_5 {
    public static void main(String[] args) {
        rockstar tommyvecetti = new rockstar();
        tommyvecetti.fire();
        tommyvecetti.hit();
        tommyvecetti.run();
    }
}
