package R_1_26;
import java.util.Scanner;
public class SMPS4_8 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter number first");
        int a = sc.nextInt();
        System.out.println("Enter number second");
        int b = sc.nextInt();
        System.out.println("Enter number third");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is greatest");
        } else if (b>a && b>c) {
            System.out.println("B is greatest");
        }
        else {
            System.out.println("C is greatest");
        }
    }
}
