package R_9_29_25;
import java.util.Scanner;
public class SMPS4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get day");
        int num = sc.nextInt();
        switch (num){
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            default:
                System.out.println("enter proper number");
                break;



        }
    }
}
