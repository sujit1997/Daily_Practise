package R_1_31;
abstract class pen{
    public void write(){
        System.out.println("Pen");
    }
    public void refill(){
        System.out.println("Refill");
    }
}
class fountainpen extends pen {
public void changenib(){
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
