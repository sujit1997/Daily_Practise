package R_5_8;
import java.util.Scanner;
public class SMPS6_2 {
    public static void main(String[] args) {
        int [] marks = {96,74,85,74,85};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is present in an array or not");
        int num = sc.nextInt();
        boolean isInArray = false;
        for(int i=0;i<= marks.length-1;i++){
            if(num==marks[i]){
                isInArray = true;
                break;
            }
             }
        if(isInArray){
            System.out.println("Number is present in an array");
        }
        else {
            System.out.println("Number is not present in an array");
        }
        }
    }
