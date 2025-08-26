package R_8_26;
abstract class pen {
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
     void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    public static void changenib(){
        System.out.println("change nib");
    }
}
public class SMPS11_1 {
    public static void main(String[] args) {
        fountainpen parker = new fountainpen();
        parker.write();
        parker.refill();
        parker.changenib();
    }
}
