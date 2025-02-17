package R_2_12;
import java.util.Scanner;
public class SMPS4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Its an even number");
        }
        else {
            System.out.println("Its an odd number");
        }
    }
}
