package R_6_10;
class cellphone{
    public static void ring(){
        System.out.println("ring");
    }
    public static void vibrate(){
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
