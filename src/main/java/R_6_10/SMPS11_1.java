package R_6_10;
abstract class pen {
    public static void write(){}
    public static void refill(){}
}
class fountainpen extends pen{
    public static void write(){
        System.out.println("write");
    }
    public static void refill(){
        System.out.println("refill");
    }
    public static void changeNib(){
        System.out.println("change nib");
    }
}
public class SMPS11_1 {
    public static void main(String[] args) {
     fountainpen parker = new fountainpen();
     parker.write();
     parker.refill();
     parker.changeNib();
    }
}
