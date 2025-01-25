package R_1_25;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class Fountainpen extends pen{
   void changeNib(){
        System.out.println("changeNIb");
    }
    void refill(){
        System.out.println("Refill");
    }
    void write(){
        System.out.println("Write");
    }

}
public class SMPS11_1 {
    public static void main(String[] args) {
        Fountainpen parker = new Fountainpen();
        parker.changeNib();

    }
}
