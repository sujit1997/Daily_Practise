package R_5_28;
import java.util.Scanner;
public class SMPS6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks2 = {96,74,85,63,52};
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean itispresent = false;
        for(int i=0; i <= marks2.length-1; i++){
            if(num==marks2[i]){
                itispresent = true;
            }
        }
        if (itispresent){
            System.out.println("number is present in an array");
        }
        else{
            System.out.println("number is not present in an array");
        }
    }
}
