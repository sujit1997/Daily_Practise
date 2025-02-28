package R_2_24;
import java.util.Scanner;
public class SMPS5_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number to get addition of it multiplication table ");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            sum +=num*i;
        }
        System.out.println(sum);

    }
}
