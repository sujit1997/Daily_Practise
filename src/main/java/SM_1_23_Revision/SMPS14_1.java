package SM_1_23_Revision;

public class SMPS14_1 {
    public static void main(String[] args) {
       // int n = 5 // syntax error;
        //int age = 78;
        //int year_born = 200-78 //Logical error
       // System.out.println(6/0);// runtime error

        // Problem 2
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
