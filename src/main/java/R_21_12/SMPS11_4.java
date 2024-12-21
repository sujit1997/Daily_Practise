package R_21_12;
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("ring");
    }
    public void lift(){
        System.out.println("lift");
    }
    public void disconnect(){
        System.out.println("disconnect");
    }
}
public class SMPS11_4 {
    public static void main(String[] args) {
        SmartTelephone dell = new SmartTelephone();
        dell.ring();
        dell.lift();
        dell.disconnect();
    }
    }