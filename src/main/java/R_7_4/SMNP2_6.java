package R_7_4;
import java.util.Scanner;
public class SMNP2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();

        int sum = 0;
        int original = num;

        while(num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }

        System.out.println("sum of two digit is " +sum);
    }
}
