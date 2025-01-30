package R_1_30;
import java.util.Scanner;
public class SMPS6_2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int [] marks = {56,74,96,13,75};
        System.out.println("Enter a number to find it present in an array or not");
        int num = sc.nextInt();
        for(int i=0;i<=marks.length-1;i++){
            if(num ==marks[i]){
                System.out.println("Number is present in an array");
                break;
            }
                   }
    }
}
