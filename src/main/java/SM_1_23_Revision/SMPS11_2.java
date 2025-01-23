package SM_1_23_Revision;
class fountainpen extends pen {
    public void changenib(){
        System.out.println("change nib");
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
