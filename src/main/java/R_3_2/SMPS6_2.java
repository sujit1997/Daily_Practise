package R_3_2;
import java.util.Scanner;
public class SMPS6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []marks = {56,74,85,96,45};
        System.out.println("Enter a number to check it is present in an array of not");
        int num  = sc.nextInt();
        boolean isInArray = false;
        for(int i=0;i<= marks.length-1;i++){
            if(num==marks[i]){
                isInArray = true;
                break;
            }

        }
        if(isInArray){
            System.out.println("NUMBER is present in an array");
        }
        else {
            System.out.println("number is not present in an array");
        }
    }
}
