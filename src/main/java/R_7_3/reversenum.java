package R_7_3;
import java.util.Scanner;
public class reversenum {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int reversenumber = 0;

        while(num !=0){
            int digit = num %10;
            reversenumber = reversenumber *10 + digit;
            num= num/10;
        }

        System.out.println("reverse number is " +reversenumber);
    }
}
