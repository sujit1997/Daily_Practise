package R_5_8;
class rockstar{
    public static void hit(){
        System.out.println("hitting");
    }
    public static void run(){
        System.out.println("run");
    }
    public static void fire(){
        System.out.println("firing");
    }
}
public class SMPS8_4 {
    public static void main(String[] args) {
        rockstar tommy = new rockstar();
        tommy.fire();
        tommy.hit();
        tommy.run();
    }
}
