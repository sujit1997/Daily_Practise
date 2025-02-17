package R_2_13;
import java.util.Scanner;
public class SMPS6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {84,76,96,32,74};
        boolean isinarray = false;
        System.out.println("Enter a number to find it is in array or not");
        int num = sc.nextInt();
        for(int i=0;i<=marks.length-1;i++){
            if(num==marks[i]){
                isinarray = true;
            }
        }
        if(isinarray){
            System.out.println("Number is present in array");
        }
        else {
            System.out.println("Number is not present in array");
        }
    }
}
