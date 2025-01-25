package R_1_25;
import java.util.Scanner;
public class SMPS7_7 {
    static void repeat(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to repeat");
        int num = sc.nextInt();
        repeat(num);
    }
}
