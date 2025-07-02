package R_7_2;
class Rockstar{
    public static void fire(){
        System.out.println("fire");
    }
public static void run(){
    System.out.println("Running");
}
public static void hit(){
    System.out.println("hit");
}
}
public class SMPS8_1 extends Rockstar {
    public static void main(String[] args) {
       Rockstar tommyVecetti = new Rockstar();
       tommyVecetti.fire();
       tommyVecetti.hit();
       tommyVecetti.run();

    }
}
