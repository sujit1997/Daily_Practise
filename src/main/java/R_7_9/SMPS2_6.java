package R_7_9;
import java.util.Scanner;
public class SMPS2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter Arithmetic operation like +, -, /, %, *");
        char operator = sc.next().charAt(0);
        System.out.println("Enter second number");
        double b = sc.nextDouble();

        double result = 0;

        switch (operator){
            case '+':
                result = a+b;
                break;

            case '-':
                result = a-b;
                break;

            case '/':
                result = a/b;
                break;

            case '%':
                result = a%b;
                break;

            case '*':
                result = a*b;
                break;

            default:
                System.out.println("Enter proper number and character");
                break;
        }
        System.out.println();
        System.out.printf("Result of %.2f %c %.2f is : %.2f%n ", a, operator, b, result);

    }
}
