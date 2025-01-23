package SM_1_23_Revision;
import java.util.Scanner;
public class SMPS5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its multiplication table in reverse order");
        int num=sc.nextInt();
        for(int i=10;i>=1;i--){
            System.out.format("%d * %d = %d\n", num,i,num*i);
        }
    }
}
