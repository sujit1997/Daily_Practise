package R_3_2;
abstract class pen{
    public static void write(){
        System.out.println("writing");
    }
    public static void refill(){
        System.out.println("refill");
    }
}
class fountainpen extends pen{
        public static void changenib(){
            System.out.println("changenib");
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
