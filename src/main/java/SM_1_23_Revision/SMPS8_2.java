package SM_1_23_Revision;
class cellphone{
    public  void ring(){
        System.out.println("RIng");
    }
    public  void vibrate(){
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
