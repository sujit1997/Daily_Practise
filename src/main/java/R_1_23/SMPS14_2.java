package R_1_23;

public class SMPS14_2 {
    public static void main(String[] args) {
        try{
            int a= 666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("haha");
        }
        catch(ArithmeticException e){
            System.out.println("ha ha");
        }
    }
}
