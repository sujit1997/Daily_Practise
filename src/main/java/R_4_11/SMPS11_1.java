package R_4_11;
abstract  class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{

    public void write(){
        System.out.println("Writing");
    }
    public void refill(){
        System.out.println("Refill");
    }
    public static void color(){
        System.out.println("blue");
    }
}
public class SMPS11_1 {
    public static void main(String[] args) {
    fountainpen parker = new fountainpen();
    parker.write();
    parker.refill();
    parker.color();

}
}
