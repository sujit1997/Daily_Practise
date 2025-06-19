package R_6_17;
import java.util.Scanner;
public class SMPS4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        switch(num){
            case 1 :
                System.out.println("today is sunday");
                break;
            case 2 :
                System.out.println("today is monday");
                break;
            case 3 :
                System.out.println("today is tuesday");
                break;
            case 4 :
                System.out.println("today is wednsday");
                break;
            default:
                System.out.println("enter proper number tp get day");
                break;
        }
    }
}
