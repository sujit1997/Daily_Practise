package R_1_22_Eve;
class cellphone{
    String ring;
    String vibrate;
    static void ring(){
        System.out.println("ring");
    }
    static void vibrate(){
        System.out.println("vibrate");
    }
}
public class SMPS8_2 {
    public static void main(String[] args) {
        cellphone samsung = new cellphone();
        samsung.ring();
        samsung.vibrate();
    }
}
