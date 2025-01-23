package SM_1_23_Revision;
import java.util.Scanner;

public class SMPS7_1 {
    static void table(int num){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d \n", num,i,num*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its multiplication table");
        int num = sc.nextInt();
        table(num);
    }
}
