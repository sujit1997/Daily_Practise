package R_16_12;
import java.util.Scanner;

public class SMPS5_8a {
    public int fact2(int num2){
        if(num2 <=1){
            return 1;
        }
        return num2 * fact2(num2-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its factorial using recursion ");
        int num2 = sc.nextInt();
        SMPS5_8a obj = new SMPS5_8a();
        int result = obj.fact2(num2);
        System.out.println(result);
    }
}
