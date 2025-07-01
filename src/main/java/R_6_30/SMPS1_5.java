package R_6_30;
import java.util.Scanner;
public class SMPS1_5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km to convert into miles : ");
        int km = sc.nextInt();
        float miles = km * 0.60f;
        System.out.println("Your miles is " +miles);
    }
}
