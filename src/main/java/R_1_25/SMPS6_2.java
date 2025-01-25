package R_1_25;
import java.util.Scanner;
public class SMPS6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {96,74,85,41,52};
        System.out.println("Enter a number to find it in marks array");
        int num = sc.nextInt();
        boolean isInArray = false;
        for(int i=0;i<= marks.length-1;i++){
            if(num ==marks[i]){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("Number present in an array");
        }
        else {
            System.out.println("Number is not present in an array");
        }
    }
}
