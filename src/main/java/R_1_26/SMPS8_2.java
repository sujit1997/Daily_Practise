package R_1_26;
class cellphone{
    String ring;
    String vibrate;
    public static void ring(){
        System.out.println("Ringing");
    }
    public static void vibrate(){
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
