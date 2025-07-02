package R_7_2;
import java.util.Scanner;
public class SMPS7_1 {
    public static void table(int num){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d\n" ,num,i,num*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get multiplication table");
        int num = sc.nextInt();
        table(num);
    }
}
