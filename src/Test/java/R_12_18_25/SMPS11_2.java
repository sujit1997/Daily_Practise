package R_12_18_25;
class fountainpen extends pen{
    void changenib(){
        System.out.println("change nib");
    }
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
}
public class SMPS11_2 {
    public static void main(String[] args) {
        fountainpen parker = new fountainpen();
        parker.refill();
        parker.write();
        parker.changenib();
    }
}
