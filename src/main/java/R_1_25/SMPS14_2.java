package R_1_25;

public class SMPS14_2 {
    public static void main(String[] args) {
       try {
           int exp = 666 / 0;
       } catch ( ArithmeticException e) {
           System.out.println("ha ha");
       }
       catch (IllegalArgumentException f){
           System.out.println("hi hi");
       }
    }
}
