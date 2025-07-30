package R_7_29;
import java.util.Scanner;
public class SMPS5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its factorial :");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=num;i++){
            fact *=i;
        }
        System.out.println(fact);
    }
}
