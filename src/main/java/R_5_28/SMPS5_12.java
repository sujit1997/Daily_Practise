package R_5_28;
import java.util.Scanner;
public class SMPS5_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += num*i;
        }
        System.out.println(sum);
    }
}
