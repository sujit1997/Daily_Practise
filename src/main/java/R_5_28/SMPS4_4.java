package R_5_28;
import java.util.Scanner;
public class SMPS4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get day : ");
        int num = sc.nextInt();
        switch (num){
            case 1 :
                System.out.println("Today is sunday");
                break;
            case 2 :
                System.out.println("Today is monday");
                break;
            case 7 :
                System.out.println("Today is saturday");
                break;
            default :
                System.out.println("Enter proper number");
        }
    }
}
