package R_1_26;
import java.util.Scanner;
public class SMPS7_1 {
    static void mul(int num){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d \n",num,i,num*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get multiplication table : ");
        int num = sc.nextInt();
       mul(num);
    }
}
