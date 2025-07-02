package R_7_2;
import java.util.Scanner;
public class SMPS6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {96,74,85,96,74};
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean isPresent = false;
        for(int i=0;i<= marks.length-1;i++){
            if(num == marks[i]){
                isPresent = true;
            }
        }
        if(isPresent){
            System.out.println("Number is present in array");
        }
        else {
            System.out.println("Number is not present in array");
        }
    }
}
