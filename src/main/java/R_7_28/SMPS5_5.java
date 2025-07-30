package R_7_28;
import java.util.Scanner;
public class SMPS5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        int total = 0 ;
        for(int i=1;i<=a;i++){
            total += 2*i;
        }
        System.out.println(total);
    }
}
