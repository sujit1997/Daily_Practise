package R_6_9;
import java.util.Scanner;
public class SMPS4_4 {
    public static void main(String[] args){
        System.out.println("Enter a number to get date");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednsday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Enter proper number");
                break;
        }
    }
}
