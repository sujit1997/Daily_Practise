package R_4_11;
class fountainpen2 extends pen{
    public  void write(){
        System.out.println("Write");
    }
    public void refill(){
        System.out.println("Refill");
    }
    public void changenib(){
        System.out.println("changenib");
    }
}
public class SMPS11_2 {
    public static void main(String[] args) {
        fountainpen2 rotor = new fountainpen2();
        rotor.changenib();
        rotor.write();
        rotor.refill();
    }


}
