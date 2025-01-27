package R_1_27;
class fountainpen extends pen{
    public void changeNib(){
        System.out.println("Changenib");
    }
}
public class SMPS11_2 {
    public static void main(String[] args) {
        fountainpen parker = new fountainpen();
        parker.write();
        parker.write();
        parker.refill();
    }
}
