package R_16_12;
import java.util.Scanner;
public class SMPS7_1 {

    static void table(int num) {
        System.out.println("Multiplication table of " +num);
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d" , num,i,num*i);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get multiplication table : ");
        int num = sc.nextInt();
        table(num);

    }
}
