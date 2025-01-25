package R_1_25;
import java.util.Scanner;
public class SMPS7_1 {
    static void mul(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its multiplication table : ");
        int n= sc.nextInt();
       mul(n);
    }
}
