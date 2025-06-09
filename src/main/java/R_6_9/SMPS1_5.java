package R_6_9;
import java.util.Scanner;
public class SMPS1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a km");
        float km = sc.nextFloat();
        float miles = km * 0.60f;
        System.out.format("KM in miles %.1f" ,miles);
    }
}
