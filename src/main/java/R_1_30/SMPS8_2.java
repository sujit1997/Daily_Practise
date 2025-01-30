package R_1_30;
class cellphone{
    static void ring(){
        System.out.println("ringing");
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
