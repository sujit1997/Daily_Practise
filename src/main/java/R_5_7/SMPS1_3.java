package R_5_7;
import java.util.Scanner;
public class SMPS1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Physics");
        int a = sc.nextInt();
        System.out.println("Enter marks of Chemistry");
        int b = sc.nextInt();
        System.out.println("Enter marks of Mathematics");
        int c = sc.nextInt();
        int total = a+b+c;

        float per = total / 300.0f*100;
        System.out.println(per);

        float cgpa = per / 10.0f;
        System.out.println(cgpa);
    }
}
