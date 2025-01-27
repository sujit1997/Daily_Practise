package R_1_27;
public class SMPS14_2 {
    public static void main(String[] args) {
         try {
             int exp = 666/0;
         }
         catch (ArithmeticException e){
             System.out.println("Ha ha");
         }
         catch (IllegalArgumentException e){
             System.out.println("He he");
         }


    }
}
