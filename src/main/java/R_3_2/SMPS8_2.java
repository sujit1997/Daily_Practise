package R_3_2;
class cellphone{
    public static void ring(){
        System.out.println("RINGING");
    }
    public static void vibrate(){
        System.out.println("VIBRATING");
    }
}
public class SMPS8_2 {
    public static void main(String[] args) {
        cellphone samsung = new cellphone();
        samsung.ring();
        samsung.vibrate();

    }
}
