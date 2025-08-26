package R_8_25;
import java.util.Scanner;
public class SMPS6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {96, 74, 85, 41, 52};
        System.out.println("Enter number to check that number is present in marks or not");
        int num = sc.nextInt();
        boolean ispresent = false;
        for(int i=0;i<=marks.length-1;i++){
            if (num==marks[i]){
                ispresent =true;
            }
        }
        if(ispresent== true){
            System.out.println("number is present ");
        }
        else {
            System.out.println("number is not present");
        }
    }
}
