package R_1_22_Eve;
class fountainpen extends pen{
    public void changenib(){
        System.out.println("changenib");
    }
}
public class SMPS11_2 {
    public static void main(String[] args) {
        fountainpen parker = new fountainpen();
        parker.write();
        parker.refill();
        parker.changenib();
    }
}
