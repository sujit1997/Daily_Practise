package R_5_30;
import java.util.Scanner;

public class SMPS1_5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter miles");
        float miles = sc.nextFloat();
        float km = miles * 0.60f;
        System.out.println(km);
    }
}
