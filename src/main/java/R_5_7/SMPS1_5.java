package R_5_7;
import java.util.Scanner;
public class SMPS1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a km ");
        int km = sc.nextInt();
        float miles = km * 0.60f;
        System.out.println(miles);
    }
}
