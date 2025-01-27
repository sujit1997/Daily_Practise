package R_1_26;
import java.util.Scanner;
public class SMPS6_2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int []marks = {56,74,53,51,63};
        System.out.println("Enter a  number to check this is present in an array or not");
        int num = sc.nextInt();
        boolean isInArray = false;
        for(int i=0;i<= marks.length-1;i++){
            if(num == marks[i]){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("This array contain given number");
        }
        else {
            System.out.println("This array does not contain you number");
        }
    }
}
