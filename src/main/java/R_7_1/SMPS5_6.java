package R_7_1;
import java.util.Scanner;
public class SMPS5_6 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter a number to get multiplication table :");
        int num = scc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d\n" ,num,i,num*i);
        }
    }
}
