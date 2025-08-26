package R_8_25;
import java.util.Scanner;
public class SMPS5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get multiplication table");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d \n", num,i, num*i);
        }
        for(int i=10;i>=1;i--){
            System.out.format("%d * %d = %d \n", num,i, num*i);
        }
    }
}
