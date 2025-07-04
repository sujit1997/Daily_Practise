package R_7_4;
import java.util.Scanner;
public class SMNP2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        int carry = 0;
        int result = 0;
        int place =1;

        while(num1>0 || num2>0 || carry >0){
            int digit1 = num1 %10;
            int digit2 = num2 %10;

            int sum = digit1 + digit2 + carry;
            int digit = sum %10;
            carry = sum /10;

            result += digit * place;
            place *=10;

            num1 /=10;
            num2 /= 10;
        }
        System.out.println("Sum is " +result);
    }
}
