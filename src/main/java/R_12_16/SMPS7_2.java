package R_12_16;
import java.util.Scanner;
public class SMPS7_2 {

    static void starPattern(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many lines of star pattern you want : ");
        int a = sc.nextInt();
       starPattern(a);
    }
}
