package R_1_25;
import java.util.Scanner;
public class SMPS7_8 {
    static void repeat(int num){
        int i=1;
        while(i<=10){
            System.out.println(num);
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to repeat");
        int num = sc.nextInt();
        repeat(num);
    }
}
