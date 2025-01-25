package R_1_25;
class cellphone{
   public static void ring(){
       System.out.println("Ringing");
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
