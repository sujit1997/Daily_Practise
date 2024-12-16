package R_16_12;
import java.util.Scanner;

public class SMPS7_7 {
    static void numRec(int num){
        for(int i=1; i<=10;i++){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
       numRec(num);
    }
}
