package R_2_13;
import java.util.Scanner;
public class SMPS7_3 {
    public static void calcsum(int num){
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get sum from 1 : ");
        int num = sc.nextInt();
        calcsum(num);
    }
}
