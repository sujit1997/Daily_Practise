package R_16_12;
import java.util.Scanner;
public class SMPS7_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        if(a<1){
            System.out.println("Enter athe position(a) to find the fibonacci number");
        } else if (a==1) {
            System.out.println("The first fibonacci number is 0");
        }
        else if (a==2){
            System.out.println("The second fibonacci number is 1");
        }
        else{
            int n1 = 0;
            int n2 = 1;
            int fib = 0;
            for(int i=3; i<=a; i++){
                fib = n1+n2;
                n1= n2;
                n2 = fib;
            }
            System.out.println("The " + a +"th  Fibonacci number is " +fib);
        }

    }
}
