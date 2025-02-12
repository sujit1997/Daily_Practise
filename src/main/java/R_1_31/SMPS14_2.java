package R_1_31;

public class SMPS14_2 {
    public static void main(String[] args) {
        try {
            int exp = 666/0;
        }
        catch (ArithmeticException e){
            System.out.println("Ha ha");
        }
        catch (IllegalArgumentException i){
            System.out.println("He He");
        }
    }
}
