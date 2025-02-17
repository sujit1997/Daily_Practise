package R_2_13;
abstract class pen {
    public static void write(){
        System.out.println("Write");
    }
    public static void refill(){
        System.out.println("Refill");
    }
}
class fountainpen extends pen{
    public static void changeNib(){
        System.out.println("Change Nib");
    }
}
public class SMPS11_1 {
    public static void main(String[] args) {
        fountainpen parker = new fountainpen();
        parker.changeNib();
        parker.write();
        parker.refill();
    }
}
