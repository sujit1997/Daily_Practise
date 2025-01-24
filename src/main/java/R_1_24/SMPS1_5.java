package R_1_24;
import java.util.Scanner;
public class SMPS1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km to convert into miles");
        float km = sc.nextFloat();
        float miles = km*0.6f;
        System.out.println(miles);
    }
}
