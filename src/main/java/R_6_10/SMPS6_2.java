package R_6_10;
import java.util.Scanner;
public class SMPS6_2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int [] marks = {96,74,85,63,41};
    boolean ispresent = false;
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        for(int i=0;i<= marks.length-1;i++){
            if(num==marks[i]){
                ispresent = true;
            }
        }
        if(ispresent){
            System.out.println("Number is present");
        }
        else {
            System.out.println("Number is not present");
        }


        }
    }
