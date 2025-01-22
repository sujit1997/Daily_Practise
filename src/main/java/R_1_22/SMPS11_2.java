package R_1_22;
class fountainPen extends pen{
void write(){
    System.out.println("Write");
}
void refill(){
    System.out.println("Refill");
}
   void changeNib(){
        System.out.println("ChangeNib");
    }
}
public class SMPS11_2 {
    public static void main(String[] args) {
    fountainPen parker = new fountainPen();
    parker.write();
    parker.refill();
    parker.changeNib();
    }
}
