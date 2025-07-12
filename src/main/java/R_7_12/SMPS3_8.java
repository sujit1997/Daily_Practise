package R_7_12;
import java.util.Scanner;
public class SMPS3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int num = sc.nextInt();
        int count = 0;
        //int num= Math.abs(num);
        if(num==0){
            count =1;
        }else {
            while (num>0){
                num = num/10;
                count++;
            }
        }
        System.out.println("number of digit in number is : " +count);
    }
}
