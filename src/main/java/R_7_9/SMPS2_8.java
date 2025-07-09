package R_7_9;

public class SMPS2_8 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = 1;

        try{
            int result = Math.addExact(a,b);
            System.out.println("Result: "+result);
        }catch (ArithmeticException e){
            System.out.println("Overflow occured " + e.getMessage());
        }
    }
}
