package R_7_4;
import java.util.Scanner;
public class SMNP1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }
        else if(num==0){
            System.out.println("Number is zero");
        }
        else {
            System.out.println("number is negative");
        }
    }
}
