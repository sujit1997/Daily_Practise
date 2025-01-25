package R_1_25;
import java.util.Scanner;
public class SMPS9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = sc.nextInt();
        System.out.println("Enter height");
        int height = sc.nextInt();
        cylinder c2 = new cylinder();


        System.out.println(c2.surfacearea(radius,height));
        System.out.println(c2.volume(radius,height));

    }
}
