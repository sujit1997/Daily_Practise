package R_7_28;
import java.util.Scanner;
public class SMPS4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get day : ");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("wednsday");
                break;
            default:
                System.out.println("enter proper number");
                break;
        }
    }
}
