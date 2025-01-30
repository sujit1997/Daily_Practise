package R_1_30;
import java.util.Scanner;
public class SMPS5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get multiplication table in reverse order : ");
        int num = sc.nextInt();
        for(int i=10;i>=1;i--){
            System.out.format("%d * %d = %d \n",num,i ,num*i);
        }
    }
}
