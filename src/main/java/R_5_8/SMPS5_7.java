package R_5_8;
import java.util.Scanner;
public class SMPS5_7 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter a number to get multiplication table");
        int num = sc.nextInt();
        for(int i=10;i>=1;i--){
            System.out.format("%d * %d = %d \n", num, i ,num*i);
        }
    }
}
