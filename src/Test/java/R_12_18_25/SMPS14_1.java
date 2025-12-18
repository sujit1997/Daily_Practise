package R_12_18_25;

public class SMPS14_1 {
    public static void main(String[] args) {
        // int yearborn = 200-75; // logical error
        // System.out.println(6/0);  // Runtime error

        try{
            int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("he he");
        }
        catch (ArithmeticException e){
            System.out.println("ha ha");
        }


    }
}
