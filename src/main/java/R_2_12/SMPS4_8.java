package R_2_12;
import java.util.Scanner;
public class SMPS4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = sc.nextInt();
        System.out.println("Enter a Second number");
        int b = sc.nextInt();
        System.out.println("Enter a Third number");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is greatest");
        } else if (b>a&&b>c) {
            System.out.println("B is greatest");
        }
        else {
            System.out.println("C is greatest");
        }
    }
}
