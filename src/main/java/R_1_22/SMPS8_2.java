package R_1_22;
class cellphone{
    String ring;
    String vibrate;
    static void ring(){
        System.out.println("Ring");
    }
    static void vibrate(){
        System.out.println("Vibrate");
    }
}
public class SMPS8_2 {
    public static void main(String[] args) {
        cellphone samsung = new cellphone();
        samsung.ring();
        samsung.vibrate();

    }
}
