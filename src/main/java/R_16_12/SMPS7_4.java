package R_16_12;
import java.util.Scanner;
public class SMPS7_4 {
    static void pattern2(int a){
        for(int i=1; i<=a; i++){
            for(int j=a; j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get star pattern");
        int a = sc.nextInt();
        pattern2(a);
    }
}
